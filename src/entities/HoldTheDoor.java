package entities;

public class HoldTheDoor {

	public static void main(String[] args) {

		int hodorStrength = 50;
		int[] doorsStrength = { 91, 24, 300 };
		int[] zombiesInflux = { 2, 3, 1 };

		int strongestDoorFinal = holdTheDoor(hodorStrength, doorsStrength, zombiesInflux);

		System.out.println(strongestDoorFinal);
	}

	public static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) {
		Float strongestDoor = (float) -1;
		float[] holdTime = new float[doorsStrength.length];

		for (int i = 0; i < doorsStrength.length; i++) {
			holdTime[i] = ((float) doorsStrength[i] + hodorStrength) / zombiesInflux[i];
		}

		int indexOfStrongestDoor = -1;

		for (int i = 0; i < holdTime.length; i++) {
			if (holdTime[i] > strongestDoor) {
				strongestDoor = holdTime[i];
				indexOfStrongestDoor = i;
			}
		}

		return indexOfStrongestDoor;
	}
}
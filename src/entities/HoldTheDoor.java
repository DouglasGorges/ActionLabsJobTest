package entities;

public class HoldTheDoor {

	public static void main(String[] args) {
		
		int hodorStrength = 50;
		int[] doorsStrength = { 10, 25, 5 };
		int[] zombiesInflux = { 20, 3, 10 };

		int strongestDoorFinal = holdTheDoor(hodorStrength, doorsStrength, zombiesInflux);

		System.out.println(strongestDoorFinal);

	}

	public static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) {
		Integer strongestDoor = -1;
		int[] holdTime = new int[doorsStrength.length];

		for (int i = 0; i < doorsStrength.length; i++) {
			holdTime[i] = (doorsStrength[i] + hodorStrength) / zombiesInflux[i];
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
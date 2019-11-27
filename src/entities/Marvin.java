package entities;

public class Marvin {

	public static void main(String[] args) {

		int[] source = { 1, 1, 2, 2, 2, 1, 5, 5 };
		int[] rareNotes = null;

		rareNotes = getRareNotes(source);

		if (rareNotes != null) {
			for (int i = 0; i < rareNotes.length; i++) {
				if (rareNotes[i] != 0)
					System.out.println(rareNotes[i]);
			}
		} else
			System.out.println("There are no rare notes.");
	}

	private static int[] getRareNotes(int[] notes) {

		int[] rareNotes = new int[notes.length];
		Integer temp = null;
		int rareIndex = 0;

		for (int i = 0; i < notes.length; i++) {
			for (int j = 0; j < notes.length; j++) {
				if (i != j) {
					if (notes[i] != notes[j])
						temp = notes[i];
					else {
						temp = null;
						break;
					}
				}
			}
			if (temp != null) {
				rareNotes[rareIndex] = temp;
				rareIndex++;
			}
		}

		boolean isRareNotesEmpty = true;

		for (int i = 0; i < rareNotes.length; i++) {
			if (rareNotes[i] != 0) {
				isRareNotesEmpty = false;
				break;
			}
		}

		if (isRareNotesEmpty)
			rareNotes = null;

		return rareNotes;
	}
}
package entities;

public class RareNotes {

	public static void main(String[] args) {

		int[] source = { 1, 1, 1, 1, 1, 1, 5, 5 };
		int[] rareNotes = null;

		rareNotes = getRareNotes(source);

		if (rareNotes != null) {
			for (int rareNote : rareNotes)
				System.out.println(rareNote);
		} else
			System.out.println("There are no rare notes.");
	}

	private static int[] getRareNotes(int[] notes) {

		int[] rareNotesTemp = new int[notes.length];
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
				rareNotesTemp[rareIndex] = temp;
				rareIndex++;
			}
		}

		boolean isRareNotesEmpty = true;
		int rareNotesLength = 0;

		for (int rareNote : rareNotesTemp) {
			if (rareNote != 0) {
				isRareNotesEmpty = false;
				rareNotesLength++;
			}
		}

		int[] rareNotes = new int[rareNotesLength];

		if (isRareNotesEmpty)
			rareNotes = null;
		else {
			int j = 0;
			for (int rareNote : rareNotesTemp)
				if (rareNote != 0) {
					rareNotes[j] = rareNote;
					j++;
				}
		}

		return rareNotes;
	}
}
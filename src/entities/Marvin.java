package entities;

public class Marvin {

	public static void main(String[] args) {
		int[] original = { 1, 3, 4, 2, 2, 1, 5, 5 };

		int[] result = null;

		result = getRareNotes(original);

		if (result != null) {

			for (int i = 0; i < result.length; i++) {
				if (result[i] != 0)
					System.out.println(result[i]);
			}

		} else
			System.out.println("NULLOO");
	}

	private static int[] getRareNotes(int[] notes) {

		int[] rareNotes = new int[notes.length];
		Integer temp = null;
		int k = 0;

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
				rareNotes[k] = temp;
				k++;
			}
		}

		boolean isEmpty = true;

		for (int i = 0; i < rareNotes.length; i++) {
			if (rareNotes[i] != 0) {
				isEmpty = false;
				break;
			}
		}

		if (isEmpty)
			rareNotes = null;

		return rareNotes;
	}
}

//int[] notes = {1, 2, 3, 2, 4, 1, 5, 5};
//Integer rareNote = null;
//Integer temp = null;
//
//for (int i = 0; i < notes.length; i++) {
//	for (int j = 0; j < notes.length; j++) {
//		if (i != j) {
//			if (notes[i] != notes[j])
//				temp = notes[i];
//			else {
//				temp = null;
//				break;
//			}
//		}
//	}
//	if (temp != null) {
//		rareNote = temp;
//	}
//}
//
//System.out.println(rareNote);

//
//
//int[] notes = { 2, 2, 4, 2, 2, 4, 5, 5 };
//int[] rareNotes = new int[notes.length];
//int k = 0;
//Integer temp = null;
//
//for (int i = 0; i < notes.length; i++) {
//	for (int j = 0; j < notes.length; j++) {
//		if (i != j) {
//			if (notes[i] != notes[j])
//				temp = notes[i];
//			else {
//				temp = null;
//				break;
//			}
//		}
//	}
//	if (temp != null) {
//		rareNotes[k] = temp;
//		k++;
//	}
//}
//
//for (int i = 0; i < rareNotes.length; i++) {
//	if (rareNotes[i] != 0)
//		System.out.println(rareNotes[i]);
//}

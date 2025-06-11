package ASSIGNMENT8_5;

public class MyTable {
	private Entry[] entries;

	public MyTable() {
		entries = new Entry[26];
	}
	//returns the String that is matched with char c in the table
	public String get(char c){
		int index = c - 'a';
		if (index >= 0 && index < 26 && entries[index] != null) {
			return entries[index].str;
		}
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		int index = c - 'a'; // get index 0–25
		if (index >= 0 && index < 26) {
			entries[index] = new Entry(s,c);
		}
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry entry : entries) {
			if (entry != null) {
				sb.append(entry.toString()).append("\n");
			}
		}
		return sb.toString();
	}
	
	
	private class Entry {
		private char ch;
		private String str;
		Entry(String str, char ch){
			this.str = str;
			this.ch = ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			return ch + "->" + str;
		}
	}

}
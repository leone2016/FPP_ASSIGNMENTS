package Assignment3_3;

public class MyStringList {

    private final int INITIAL_LENGTH = 2;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void add(String s){
        if(size >= strArray.length){
            resize();
        }
        strArray[size] = s;
        size++;

    }

    public String get(int i){
        if(i >= 0 && i < size){
            return strArray[i];}
        return null;
    }

    public boolean find(String s){
        for(int i = 0; i < size; i++){
            if(strArray[i].equals(s))
                return true;
        }
        return false;
    }

    public void insert(String s, int pos){
        if(pos < 0 || pos > size){
            System.out.println("Invalid position");
            return;
        }
        if(size >= strArray.length){
            resize();
        }
        for(int i = size; i > pos; i--){
            strArray [i] = strArray[i-1];
        }
        strArray[pos] = s;
        size++;
    }

    public boolean remove(String s){
        for(int i = 0; i< size; i++){
            if(strArray[i].equals(s)){
                for(int j = i; j< size - 1; j++){
                    strArray[j] = strArray[j + 1];
                }
                strArray[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    private void resize(){
        System.out.println("Resizing.........");
        String[] newArray = new String[strArray.length * 2];
        System.arraycopy(strArray,0,newArray,0,strArray.length);
        strArray = newArray;
    }

    public String toString(){
        String res = "[";
        for(int i =0; i< size; i++){
            res += strArray[i];
            if(i < size -1){
                res += ", ";
            }
        }
        res += "]";
        return res;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args){
        MyStringList l = new MyStringList();
        l.add("Bob");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.add("Steve");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.add("Susan");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.add("Mark");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.add("Dave");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.remove("Mark");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.remove("Bob");
        System.out.println("The list of size "+l.size()+" is "+l);
        l.insert("Richard",3);
        System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
        l.insert("Tonya",0);
        System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);
    }

}


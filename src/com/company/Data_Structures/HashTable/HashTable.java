package com.company.Data_Structures.HashTable;

public class HashTable {

    public int sizeOfTable = 20;
    HashEntry[] items = new HashEntry[sizeOfTable];


    //get
    public String get(String key){
        String item = "";

        for(int i = 0; i < items.length -1; i++){
            if(items[i].equals(key)){
                item = key;
            }
            else{
                item = null;
            }
        }
        return key;
    }



    //put
    public void put(String key, String value){
        HashEntry newit = new HashEntry(key, value);
        for(int i = 0; i < items.length-1; i++){
            if(items[i].equals(null)){
                items[i] = newit;
            }

        }
    }

    public class HashEntry{
        String key;
        String value;
        HashEntry next;

        public HashEntry(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

    }

}

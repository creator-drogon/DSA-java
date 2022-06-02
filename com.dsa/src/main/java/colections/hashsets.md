Linked hashset will maintain order of insertion while hashset will prevent entry of duplicates.

LinkedHashSet<Integer> hs = new LinkedHashSet<>();

Hashset will not be able to differentiate between same entries for user defined data type/class so we will have to override or equals and hashcode method in user defined DT.

similarly, if u are making a collection of user defined DT then collection.sort() method will not work.
We will have to implement comparable and override compareTo method --  class Animal implements Comparable{}

hashmap is basically a key value pair , to loop over a hashmap define variable

for(Map.Entry<String,String> entry : myhashmap.enrt)
public class reverseOrder { 


    int numInt = Integer.parseInt(name);
    String[] nameArr = name.split("");
    
    // create List to store the sorted elements from the array
    List<String> strArr = new ArrayList<>();
    // create a String array to store the characters from the input String
    for (int i = 0; i < name.length(); i++) {
        strArr.add(nameArr[i]);
    }
    // sort the List in reverse order
    Collections.sort(strArr, Collections.reverseOrder());
    // join the elements in the List into a String
    String finalResult = String.join("", strArr);

    System.out.println(finalResult);

}

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Prashant";
        char target = 'a';

        System.out.println(searchChar(name, target));
        System.out.println(searchChar2(name, target));
    }
    static boolean searchChar(String name, char target){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(target==name.charAt(i)){
                System.out.println(i);
                return true;
            }
        }

        return false;

    }

    static boolean searchChar2(String name, char target){
        if(name.length()==0){
            return false;
        }
        for (char ch: name.toCharArray()){
            if(ch==target){
                System.out.println(ch);
                return true;
            }
        }


    return false;
    }
}

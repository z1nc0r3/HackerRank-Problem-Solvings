public class Splitter {
    public static void main(String[] args){
        String name = "lkj@sldf'sdf asdf _lkj";

        String specialChars = "[!,? ._'@]+";
        String[] list = name.trim().split(specialChars);

        if (list.length == 1 && list[0].equals(""))
            System.out.println("0");
        else {
            System.out.println(list.length);
            for (String i : list){
                System.out.println(i);
            }
        }
    }
}

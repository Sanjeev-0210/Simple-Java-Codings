class Character{
    public static void main(String[] args) {
        char c='a';
        if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
            System.out.println("Character is Alphabet!!!!");
        }
        else if(c>='0'&&c<='9'){
            System.out.println("Character is Number!!!!");
        }
        else{
            System.out.println("Character is Special character!!!!");
        }
    }
}
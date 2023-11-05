class Test {
    private String name;
    //empty constructor
    public Test(String name){
        this.name = name;
        System.out.println("Test constructor"+name);
    }
    public Test(String name, Integer age){
        System.out.println("Test constructor"+name+" age"+age);
    }
    public static void main(String[] args) {
        String name = "hais";

       Test text = new Test(name, 12);
       Test text2 = new Test("weeee");
       
    }
}

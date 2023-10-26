class Main{
    public static void main(String[] args) {
  System.out.print("Это добавлено в ветке main");
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a + b + c);
        System.out.print("Это добавлено в ветке dev");
        System.out.println(cringeAReturn(10));
        ivanPrivet();
    }

    //Самый полезный метод в истории человечества
    public static int cringeAReturn(int a){
        return a;
    }

    //Привет Иван
    public static void ivanPrivet(){
        System.out.println("Ivan Privet");
    }
}
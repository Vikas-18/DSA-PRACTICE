class Bank{
    String name;

    public void display()
    {
        System.out.println(name);
    }

    private String password;//private access modifers only accessiable to class the only

    //getters
    //can access the private members outside of the class by using getters and setrers
    public String getpassword()
    {
       return password;
    }

    //setters
    public void setpassword(String password)
    {
        this.password = password;
    }
}




public class getters_setters {
    public static void main(String[] args) {
        Bank b1 = new Bank();

        b1.setpassword("vikas");
       System.out.println(b1.getpassword());
    }
}

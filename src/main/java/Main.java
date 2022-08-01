public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport="4444 № 44444444";
        post.patronymic="Иванович";
        post.phone="+7 (999)-999-99-99";
        post.surname="Иванов";
        post.subscription=true;
        post.birthday=new FormDate();
        post.birthday.day=12;
        post.birthday.month=12;
        post.birthday.year=1999;



        System.out.print("{"+"surname: "+ post.surname + ",\n");
        System.out.println("name: "+post.name+",");
        System.out.println("patronymic: "+post.patronymic+",");
        System.out.println("passport: "+post.passport+",");
        System.out.println("phone: "+post.phone+",");
        System.out.println("subscription: "+post.subscription+",");
        System.out.println("birthday: "+post.birthday.day+"."+post.birthday.month+"."+post.birthday.year+" }\n");
        


    }
}

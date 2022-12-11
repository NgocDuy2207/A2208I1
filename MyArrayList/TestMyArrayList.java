package MyArrayList;

public class TestMyArrayList {
    public static   void main(String[] args) {
        Person person1 = new Person(1, "Ngọc Duy", 26);
        Person person2 = new Person(2, "Ngọc Huy", 27);
        Person person3 = new Person(3, "Ngọc Hùng", 28);
        Person person4 = new Person(4, "Ngọc Dũng", 29);
        Person person5 = new Person(5, "Ngọc Hiền", 30);
        MyArrayList<Person> personMyArrayList = new MyArrayList<Person>();
        personMyArrayList.add(person1);
        personMyArrayList.add(person2);
        personMyArrayList.add(person3);
        personMyArrayList.add(person4);
        personMyArrayList.add(person5, 2);
        personMyArrayList.remove(0);
        for (int i = 0; i < personMyArrayList.size();i++){
            Person person = (Person) personMyArrayList.elements[i];
            System.out.println(person.getId());
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }

    public static class Person{
        private int id;
        private String name;
        private int age;
        public Person(){

        }

        public Person(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}

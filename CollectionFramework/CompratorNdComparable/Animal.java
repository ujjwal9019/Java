package CollectionFramework.CompratorNdComparable;

public class Animal  implements Comparable <Animal>{
    int age;
    String Name ;
    int weight ; 

    public Animal(int age, String Name, int weight) {
        this.age = age;
        this.Name = Name;
        this.weight = weight;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "{" +
            " age='" + getAge() + "'" +
            ", Name='" + getName() + "'" +
            ", weight='" + getWeight() + "'" +
            "}"+"\n";
    }

    @Override
    public int compareTo(Animal That){
        
        if(this.age == That.age){
           return this.Name.compareTo(That.Name);
        }
         return this.age - That.age;
    }


}

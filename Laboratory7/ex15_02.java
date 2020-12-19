package Laboratory7;
/*
2. Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).

*/
public class ex15_02 {
    public static void main(String[] args){
    superClass superObject = new superClass("My super Class");
    System.out.println(superObject.getMySuperStringString()+" " + superObject.getLengthMySuperString());
    }
}

class superClass{
    private String mySuperString;

    superClass(){
        setString();
    }
    superClass(String mySuperString){
        this.mySuperString = mySuperString;
    }
    public void setString(){
        mySuperString = "default";
    }
    public void setString(String mySuperString){
        this.mySuperString = mySuperString;
    }

    public int getLengthMySuperString(){
        return mySuperString.length();
    }
    public String getMySuperStringString(){
        return this.mySuperString;
    }
}
class subClass extends superClass{
    public int mySubInt;

    subClass(int myInt, String myString){
        this.mySubInt = myInt;
        super.setString(myString);
    }

    @Override
    public void setString(){
        System.out.println("Default field = 0");
        mySubInt = 0;
    }
    @Override
    public void setString(String mySubString){
        super.setString(mySubString);
    }
    public void setInt(int mySubInt){
        this.mySubInt = mySubInt;
    }
    public void setMyStringAndInt(int mySubInt, String myString){
        this.mySubInt = mySubInt;
        super.setString(myString);
    }
}

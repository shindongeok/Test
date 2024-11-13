package test.p731;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
    private int pno;
    private String name;
    private String company;
    private int price;

    Product(int pno, String name,String company, int price){
        this.pno=pno;
        this.name=name;
        this.company=company;
        this.price=price;
    }
    int getPno(){return pno;}
    String getName(){return name;}
    String getCompany(){return company;}
    int getPrice(){return price;}

    @Override
    public String toString(){
        return new StringBuilder()
                .append("{")
                .append("pno:"+ pno + ", ")
                .append("name:" + name + ", ")
                .append("company:" + company + ", ")
                .append("price:" + price)
                .append("}")
                .toString();
    }
}
public class StreamExamlpe {
    public static void main(String[] args) {
        //list 컬렉션 생성
        List<Product> list = new ArrayList<>();
        for(int i=1; i<=5; i++){
            Product product = new Product(i, "상품"+i,"멋진회사 ", (int)(10000*Math.random()));
            list.add(product);
        }

        //객체 스트림 얻기
        Stream<Product> stream = list.stream();
        stream.forEach(p-> System.out.println(p));
    }
}

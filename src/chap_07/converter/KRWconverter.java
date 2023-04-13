package chap_07.converter;

public class KRWconverter implements Convertible{

    @Override
    public void convert(int usd) {
        System.out.println(usd +"달러 : " +(usd*1400)+"원"  );
    }
}

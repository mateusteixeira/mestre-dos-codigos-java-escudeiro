package knowingtheplatform.workingwithdatatypes.workingwithbigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMath {

    public static void main(String[] args) {

        System.out.println("Subtraction: " + new BigDecimal("4").subtract(new BigDecimal("3")));

        System.out.println("Addition: " + new BigDecimal("90").add(new BigDecimal("103")));

        //Arredondando para o próximo vizinho, se for equidistante arredonda para cima
        System.out.println("Subtraction with HALF_UP: " + new BigDecimal("90.342").subtract(new BigDecimal("20.2345")).setScale(2, RoundingMode.HALF_UP));

        //Arredondando para o próximo vizinho, se for equidistante arredonda para baixo
        System.out.println("Addition with HALF_DOWN: " + new BigDecimal("90.2345").add(new BigDecimal("103.11")).setScale(4, RoundingMode.HALF_DOWN));

        //Arredondando para o máximo positivo infinito com escala de sete casas decimais
        System.out.println("Division with CEILING: " + new BigDecimal("4923.56").divide(new BigDecimal("93.645"), 7, RoundingMode.CEILING));

        //Arredondando para o máximo negativo infinito com escala de cinco casas decimais
        System.out.println("Multiply with FLOOR: " + new BigDecimal("53.74").multiply(new BigDecimal("93.00063232")).setScale(5, RoundingMode.FLOOR));

        //Arredondando para longe do zero com escala de quatro casas decimais
        System.out.println("Division with UP: " + new BigDecimal("4923.56").divide(new BigDecimal("93.645"), 4, RoundingMode.UP));

        //Arredondando para perto do zero com escala de seis casas decimais
        System.out.println("Multiply with DOWN: " + new BigDecimal("53.74").multiply(new BigDecimal("93.00063232")).setScale(6, RoundingMode.DOWN));

        //Arredondando para o próximo vizinho, se for equidistante arredonda para o vizinho par
        System.out.println("Pow with HALF_EVEN: " + new BigDecimal("45.234").pow(3).setScale(3, RoundingMode.HALF_EVEN));

        //Sem arredondamento
        System.out.println("Pow with UNNECESSARY : " + new BigDecimal("45").pow(3).setScale(0, RoundingMode.UNNECESSARY));

    }
}

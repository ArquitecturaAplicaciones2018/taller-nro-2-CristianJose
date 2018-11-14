import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class TestTaller2 {
    
    public TestTaller2() {
    }
    //Se declara la instancia de objetos
    Rational r1 = new Rational(4,5);
    Rational r2 = new Rational(3,2);
    //El parametro de exepcion atrapa el error del denominador con 0
    @Test(expected = IllegalArgumentException.class)
    public void denominator(){
        Rational r = new Rational(2,0);
    }
    //Compara si es menor que
    @Test
    public void isLessThan(){
        assertEquals(true,r1.isLessThan(r2));
    }
    //Compara si el numero es mayor
    @Test
    public void getGreater(){
        assertEquals(r2,r1.getGreater(r2));
    }
    @Test
    //Realiza la suma de los valores y compara si esta correcto
    public void plus(){
        assertEquals(23,r1.plus(r2).getNumerator());
        assertEquals(10,r1.plus(r2).getDenominator());
    }
    //realiza la resta y la compara con el valor 
    @Test
    public void minus(){
        assertEquals("7/-10",r1.minus(r2).toString());

    }
    //Realiza la multiplicacion y la compara con el valor
    @Test
    public void times(){
        assertEquals(6,r1.times(r2).getNumerator());
        assertEquals(5,r1.times(r2).getDenominator());
    }
    @Test
    //Realiza la divicion y la compara con el valor
    public void divides(){
        assertEquals(8,r1.divides(r2).getNumerator());
        assertEquals(15,r1.divides(r2).getDenominator());
    }
}

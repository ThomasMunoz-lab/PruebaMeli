import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

public class TragamonedasTest {


    @Test
    public void SeCreoUnTambor(){

        Tambor tambor = new Tambor();
        Assertions.assertThat(tambor).isNotNull();
    }

    @Test
    public void SeCreoUnTragamonedas(){

        Tambor tambor1 = new Tambor();
        Tambor tambor2 = new Tambor();
        Tambor tambor3 = new Tambor();
        Tragamonedas tragamonedas = new Tragamonedas(tambor1, tambor2, tambor3);
        Assertions.assertThat(tragamonedas).isNotNull();

    }



    @Test
    public void SeCreoUnTamborYSeObtuvoSuPosicion(){

        Tambor tambor1 = new Tambor();
        Assertions.assertThat(tambor1.obtenerPosicion()).isLessThan(9);
        Assertions.assertThat(tambor1.obtenerPosicion()).isGreaterThan(1);
    }

    @Test
    public void SeDebeEntregarElPremio(){
        TamborTrucho tambor1 = new TamborTrucho();
        TamborTrucho tambor2 = new TamborTrucho();
        TamborTrucho tambor3 = new TamborTrucho();

        Tragamonedas tragamonedas = new Tragamonedas(tambor1,tambor2,tambor3);

        tragamonedas.obtenerPremio();
    }

    @Mock
    private Tambor mockAuthDao1 = new Tambor();

    @Mock
    private Tambor mockAuthDao2 = new Tambor();

    @Mock
    private Tambor mockAuthDao3 = new Tambor();




    private static Tambor tamborMock;


    @Test
    public void SeDebeEntregarElPremioMocking()  {
       /* tamborMock = mock(Tambor.class);
        Tambor tambor2 = new Tambor();
        Tambor tambor3 = new Tambor();
     //   Tragamonedas tragamonedas = new Tragamonedas(tambor1, tambor2, tambor3);
*/
        when(mockAuthDao1.obtenerPosicion()).thenReturn(3);
        when(mockAuthDao2.obtenerPosicion()).thenReturn(3);
        when(mockAuthDao3.obtenerPosicion()).thenReturn(3);



        Tragamonedas tragamonedas = new Tragamonedas(mockAuthDao1, mockAuthDao2, mockAuthDao3);

        Assertions.assertThat(tragamonedas.obtenerPremio()).isTrue();

    }

}

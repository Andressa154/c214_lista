
package mokito;
import exercicio.BuscaProfessor;
import exercicio.Professor;
import exercicio.ProfessorService;
import teste.ProfessorConst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


 


@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaProfessorMokito {

    @Mock
    private ProfessorService service;
    private BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfessorRenzo(){
        Mockito.when(service.busca(5)).thenReturn(ProfessorConst.Renzo);
        Professor Renzo = buscaProfessor.buscaProfessor(5);
        assertEquals("Renzo", Renzo.getNome());
        assertEquals("14 horas", Renzo.gethorario_atendimento());
        assertEquals("Integral", Renzo.getperiodo());

    }
    @Test
    public void testeBuscaProfessorMarcelo(){
        Mockito.when(service.busca(6)).thenReturn(ProfessorConst.Marcelo);

        Professor Marcelo = buscaProfessor.buscaProfessor(5);
        assertEquals("Marcelo", Marcelo.getNome());
        assertEquals("15 horas", Marcelo.gethorario_atendimento());
        assertEquals("Integral", Marcelo.getperiodo());

    }
     @Test
    public void testeBuscaProfessorChris(){
        Mockito.when(service.busca(7)).thenReturn(ProfessorConst.Chris);
        Professor Chris = buscaProfessor.buscaProfessor(7);
        assertEquals("Chris", Chris.getNome());
        assertEquals("16 horas", Chris.gethorario_atendimento());
        assertEquals("Integral", Chris.getperiodo());

    }

}


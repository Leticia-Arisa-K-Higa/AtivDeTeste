package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.IRPF;

public class CadastroRendimentosTest{
  
  private IRPF irpf;

  @Before
  public void setup() {
    irpf = new IRPF();
  }
  
  @Test
  public void testCadastraSalario() {
    irpf.cadastrarSalario(5000f);
    assertEquals(5000f, irpf.getTotalSalarioo(), 0);
  }

  @Test
  public void testCadastraSalario2() {
    irpf.cadastrarSalario(6000f);
    assertEquals(6000f, irpf.getTotalSalarioo(), 0);
  }

  @Test
  public void testCadastraSalario3() {
    irpf.cadastrarSalario(5000f);
    irpf.cadastrarSalario(6000f);
    assertEquals(6000f, irpf.getTotalSalarioo(), 0);
  }
}

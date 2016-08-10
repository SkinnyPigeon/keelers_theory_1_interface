import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PeopleTest {

  AmysBody amy;
  ProfsBody professor;
  BendersBody bender;

  @Before 
  public void before() {
    amy = new AmysBody();
    professor = new ProfsBody();
    bender = new BendersBody();
  }

  @Test
  public void amyIsProfessor(){
    assertEquals( "I'm the professor", amy.prof() );
  }

  @Test
  public void amyIsAmy(){
    assertEquals( "I'm Amy", amy.amy() );
  }

  @Test
  public void professorIsProfessor(){
    assertEquals( "I'm the professor", professor.prof() );
  }

  @Test
  public void professorIsAmy(){
    assertEquals( "I'm Amy", professor.amy() );
  }

  @Test
  public void benderIsAmy() {
    assertEquals( "I'm Amy", bender.amy() );
  }

  @Test
  public void benderIsBender() {
    assertEquals( "I'm Bender", bender.bender() );
  }


}
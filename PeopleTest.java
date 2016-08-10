import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PeopleTest {

  AmysBody amy;
  ProfsBody professor;

  @Before 
  public void before() {
    amy = new AmysBody();
    professor = new ProfsBody();
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


}
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertNotNull;

/**
 * Created By iw.jhun
 * On 2018-04-09 , 오후 3:21
 */
public class CatalogTest {

    private final Catalog catalog = new Catalog();

    //    @Test(expected = NullPointerException.class)
// expected를 이용한 runtime 에러를 잡기에는 여러가지 고려할 상황이 많기 때문에 사용하지 말라고 하는 얘기가 있다.
//    https://pettermahlen.com/2012/02/07/dont-use-testexpected/
    // 11버전에서부터 추가 된 Rule 방식으로 진행이 가능하다.
//    https://junit.org/junit4/javadoc/4.12/org/junit/rules/ExpectedException.html
//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void init() {

    }

    @Test
    public void isNullTitle() {
        catalog.setTitle("some-title");
        assertNotNull(catalog.getTitle());
    }

    // 아래 expected 는 기존 junit의 방법이다.
    @Test(expected = NullPointerException.class)
    public void onNullException() {
        // 이것은 위의 @Rule로 선언 된 Expected에게 nullpoint를 추가하는 것이다.
//        expectedException.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test()
    public void dateCalc(){

        LocalDate joinDate = LocalDate.of(2017,7,10);

        // joinDate
        System.out.println(joinDate.toString());

        // 292 days after..
        System.out.println(joinDate.atStartOfDay().plusDays(292).toString());

    }

}
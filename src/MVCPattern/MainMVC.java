package MVCPattern;

/**
 * 목적
 * 업무로직(Business Logic) 및데이터(Model)와보이는부분(View)을분리
 * 사용자 인터페이스 로직이 비즈니스 로직 보다 더 자주 바뀐다면 MVC를 사용하는 것이 바람직함
 * 화면을포함하는사용자인터페이스와업무처리부분을분리해서동작할수있도록함
 * MVC는원래Smalltalk 언어에서부터시작되었으나현재GUI를지원하는프로그램과웹프레임워크에서많이사용됨
 *
 * 요소   설명
 * 이름   MVC 혹은Model-View-Controller
 * 문제   데이터와해당데이터를보여주는부분의코드가섞여있음
 * 해결방안 데이터와뷰를분리하고이들을연동시키는컨트롤러를추가
 * 결과   loose coupling, 재사용성
 *
 * 패시브모델(Passive Model)
 * 컨트롤러만모델을조작함
 * 사용자가인터페이스를조작하거나입력하면컨트롤러가모델을수정함
 * 모델이수정된후에컨트롤러는뷰를업데이트하도록요청
 * 뷰는모델에서데이터를받아서(요청후)화면을업데이트
 *
 * 액티브모델(Active Model)
 * 컨트롤러만이모델을수정하는것이아님
 * 모델에서뷰를업데이트하도록요청하는것이가능
 * 모델이서브젝트인터페이스를제공하고뷰에서옵저버로등록
 * 뷰는모델에서데이터를받아서(요청후)화면업데이트
 *
 */
public class MainMVC {
    public static void main(String[] args){
        Student model = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        controller.updateView();
        controller.setStudentName("John");
        controller.updateView();

    }
    private static Student retrieveStudentFromDataBase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}

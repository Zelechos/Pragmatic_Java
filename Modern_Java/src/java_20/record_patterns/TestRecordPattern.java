package java_20.record_patterns;

import java.util.List;

public class TestRecordPattern {

    public static void main(String[] args) {

        Code[] as = new Code[]{new Code(0, 0), new Code(3, 9)};
//      in a simple forEach  with inference type of arguments
        for (Code(var x, var y) : as) {
            System.out.println(x + y);
        }

        List<Code> codeList = List.of(new Code(3, 4), new Code(5, 7), new Code(6, -3));
        for (Code(var c, var a) : codeList) {
            System.out.println(c + a);
        }

        codeList.forEach(code -> System.out.println(code.x() + code.y()));
    }
}

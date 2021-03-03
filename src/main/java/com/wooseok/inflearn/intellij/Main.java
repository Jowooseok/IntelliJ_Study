package com.wooseok.inflearn.intellij;

public class Main {
    //psvm
    public static void main(String[] args) throws InterruptedException {
        //sout
        System.out.println("aaa");
        //실행방법 shift+ctrl+f10

        //라인 복제 ctrl+d
        //라인 삭제 ctrl+y

        //라인 합치기 ctrl+shift+j
        String query = "SELECT * " +
                "FROM member " +
                "WHERE member.name = 'wooseok";

        //라인 옮기기
        //1.구문이동 ctrl+shift+up or down
        //2.라인이동 alt+shift+up or down
        System.out.println("옮길것");
        System.out.println("=========");
        //3. 엘리먼트 단위로 html에서 사용 alt+ctrl+shift + left or right

        //인자값 보기 ctrl+p
        //구현부 보기 ctrl+shift+i
        //Doc ctrl+q
        Thread.sleep(1000);

        //포커스
        //단어별 이동 ctrl + 이동
        //이동도 함께하려면 +shift


        //포커스 범위 늘리기 ctrl+w , ctrl+shift+w
        //이전 포커스 ctrl+alt+left,right
        //포커스 생성 ctrl 두번후 방향키
        //오류가 난곳으로 이동 f2

        /*검색*/
        //ctrl+f
        //교체 ctrl+r
        //ctrl+shift+f 전체에서 검색
    }
}

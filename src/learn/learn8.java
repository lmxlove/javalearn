package learn;

/**
 * @author <lmx>
 * @since 2022/10/30 11:17
 */
 class learn8 {
    int stu_code;
    String stu_name;
    String deptName;
    int getStu_code(){
    System.out.println(stu_code);
        return  stu_code;
    }
    boolean setStudentCode(int studentCode){
        if(studentCode>0){
            stu_code=studentCode;
            return true;
        }
        else{
            return false;
        }
    }
}

import java.util.List;

public class Avoid_DisInformation {

    // 1)
    int hp; String aix; char sco;  // 1) all these names are miss leading even if they look relevant for some examples
    // the reason for this is that these are the names of Unix platforms or variants



    // 2)

    Account accountList;  // this is wrong name convention we can not use this because it has list in and
    // actually it is not a list it is just object of account class
    // u should only use list word when there is a actually a list of something

    List<Account> accountLists;  // now this is right way to use list or container

}


class Account{

    int O;
    int l;  // these are one of worst examples of disinformation naming

    public  void main(String[] args) {
        int a = l;

        if ( O == l )

            a =1;

        else

            l = 1;


    }


}

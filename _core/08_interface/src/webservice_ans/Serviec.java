package webservice_ans;

public interface Serviec {
void register(int dbms,Member member);
void login(int dbms,Member member);
void edit(int db, Member member) ;
void resign(int db, String email);
Member[] listResult(int db);
Member Search(int db, String email);
}

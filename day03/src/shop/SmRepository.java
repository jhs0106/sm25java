package shop;

import java.util.List;

public interface SmRepository<V, K> {
    // Database에 CRUD 기능 정의
    // INSERT(C), SELECT(R), UPDATE(U), DELETE(D)
    void insert();
    void update();
    void delete();
    List<V> get();
}

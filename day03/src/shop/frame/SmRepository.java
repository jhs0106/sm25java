package shop.frame;

import java.util.List;

public interface SmRepository<V, K> {
    // Database에 CRUD 기능 정의
    // INSERT(C), SELECT(R), UPDATE(U), DELETE(D)
    void insert(V v);
    void update(V v);
    void delete(K k);
    List<V> selectAll();
    V select(K k);
}

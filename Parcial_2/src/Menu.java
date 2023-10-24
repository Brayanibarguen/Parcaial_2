import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Menu {
    private static Menu instance = new Menu();
    private Set<Juguete> juguetes;

    private Menu() {
        juguetes = new HashSet();
    }

    public static Menu getInstance() {
        return instance;
    }

    public void ejecutarAccion(EstrategiaAccion estrategia) {
        estrategia.realizarAccion((List<Juguete>) juguetes);
    }

    public Set<Juguete> getJuguetes() {
        return juguetes;
    }

    private class HashSet implements Set<Juguete> {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Juguete> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Juguete juguete) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Juguete> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    }
}
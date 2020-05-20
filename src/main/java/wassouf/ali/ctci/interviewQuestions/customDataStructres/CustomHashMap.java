package wassouf.ali.ctci.interviewQuestions.customDataStructres;

import java.util.Objects;

public class CustomHashMap<K, V>
{
    static class Node<K, V> implements Cloneable
    {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;


        public Node(int hash, K key, V value, Node<K, V> next)
        {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }


        public final K getKey()
        {
            return key;
        }


        public final V getValue()
        {
            return value;
        }


        public void setValue(V value)
        {
            this.value = value;
        }


        public final int hashCode()
        {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }


        @Override
        public final String toString()
        {
            return key + " = " + value;
        }


        public final boolean equals(Object o)
        {
            if (o == this)
            {
                return true;
            }
            if (o instanceof Node)
            {
                Node<?, ?> e = (Node<?, ?>) o;
                return Objects.equals(key, e.getKey()) &&
                    Objects.equals(value, e.getValue());
            }
            return false;
        }


        public Object clone() throws
                              CloneNotSupportedException
        {
            return super.clone();
        }
    }

    /**
     * Shifting right by 16 is equal to throwing the left half of the 32-bits number
     * Since the mask in the HashMap is a power of two, in our case 16.
     * Hashes with values that only vary in bits higher than the 15th will be similar, thus resulting in a collision.
     * For this reason we spread (XOR) the higher bits of the hashcode to the lower bits, making sure that the bits lower than the 16th are changed now.
     * Reducing the chance of collision.
     */
    static final int hash(Object key)
    {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


    @SuppressWarnings({"unchecked"})
    Node<K, V>[] table = (Node<K, V>[]) new Node[16];

    static final double LOAD_FACTOR = 0.75;
    int size = 0;


    public void put(K key, V value) throws CloneNotSupportedException
    {
        if (needsResizing())
        {
            resize();
        }
        int hash = hash(key);
        int index = table.length - 1 & hash;
        Node<K, V> current;
        if ((current = table[index]) == null)
        {
            table[index] = newNode(hash, key, value);

        }
        else
        {
            if (!current.key.equals(key))
            {
                while (current.next != null)
                {
                    current = current.next;
                }
                current.next = newNode(hash, key, value);

            }
            else
            {

                current.value = value;
            }
        }
        ++size;
    }


    @SuppressWarnings({"rawtypes", "unchecked"})
    private Node<K, V> newNode(int hash, K key, V value)
    {
        return new Node(hash, key, value, null);
    }


    private boolean needsResizing()
    {
        return size >= table.length * LOAD_FACTOR;
    }


    @SuppressWarnings("unchecked")
    private void resize() throws CloneNotSupportedException
    {
        int newSize = table.length * 2;
        // double the size of the table.
        // copy elements from the old noe to the new one.
        Node<K, V>[] newTable = (Node<K, V>[]) new Node[newSize];
        Node<K, V> oldTablePointer;
        for (int i = 0; i < table.length; i++)
        {
            if ((oldTablePointer = table[i]) != null)
            {
                table[i] = null;
                if (oldTablePointer.next == null)
                {
                    newTable[(newSize - 1) & oldTablePointer.hash] = oldTablePointer;
                }
                else
                {
                    Node<K, V> loHead = null, loTail = null;
                    Node<K, V> hiHead = null, hiTail = null;
                    Node<K, V> next;
                    do
                    {
                        next = oldTablePointer.next;
                        if ((oldTablePointer.hash & table.length) == 0)
                        {
                            if (loTail == null)
                            {
                                loHead = oldTablePointer;
                            }
                            else
                            {
                                loTail.next = oldTablePointer;
                            }
                            loTail = oldTablePointer;
                        }
                        else
                        {
                            if (hiTail == null)
                            {
                                hiHead = oldTablePointer;
                            }
                            else
                            {
                                hiTail.next = oldTablePointer;
                            }
                            hiTail = oldTablePointer;
                        }
                    } while ((oldTablePointer = next) != null);
                    if (loTail != null)
                    {
                        loTail.next = null;
                        newTable[i] = loHead;
                    }
                    if (loHead != null)
                    {
                        loHead.next = null;
                        newTable[i + table.length] = hiHead;
                    }
                }
            }
        }
        table = newTable;
    }
}

package Classes;

/**
 * <pre>
 *   Easy way to get an object instance and index in an array
 *   For example use it when you need to find a student in your array of students,
 *   and you need to get both the instance and the index in the array
 * </pre>
 * <pre>
 * Example:
 * {@code
 *   public static InstanceIndex<Student> getStudentAndIndex(int ID, ArrayList<Student> students){
 *     int index = 0;
 *     for (Student student : students){
 *       if (student.getID() == ID){
 *         return new InstanceIndex<>(student, index);
 *       }
 *       index++;
 *     }
 *     return null;
 *   }
 * }
 * </pre>
 * @record
 * @see java.lang.Record
 * @param element Instance
 * @param index Position in the array
 * @param <T> Placeholder for any kind of type/class
 * @constructor (instance, index)
 */
public record InstanceIndex<T>(T element, int index) {}

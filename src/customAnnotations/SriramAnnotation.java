package customAnnotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Specifies that this annotation will be available at runtime
@Target({ElementType.METHOD, ElementType.TYPE}) // Specifies where the annotation can be applied
public @interface SriramAnnotation {
    String value() default "Default Value"; // Annotation element with a default value
    int count() default 1;                 // Another element with a default value
}

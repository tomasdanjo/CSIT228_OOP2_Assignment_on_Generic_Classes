package Arithmetic;

public class Arithmetic {
    private Number num1;
    private Number num2;

    public Arithmetic(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        if (num1 instanceof Double && num2 instanceof Double) {
            return num1.doubleValue() + num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return num1.floatValue() + num2.floatValue();
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return num1.longValue() + num2.longValue();
        } else if(num1 instanceof Integer && num2 instanceof Integer){
            return num1.intValue() + num2.intValue();
        }else if(num1 instanceof Short && num2 instanceof Short){
            return num1.shortValue() + num2.shortValue();
        } else if(num1 instanceof Double && num2 instanceof Float){
            return num1.doubleValue()+num2.floatValue();
        }else if(num1 instanceof Double && num2 instanceof Long){
            return num1.doubleValue()+num2.longValue();
        }else if(num1 instanceof Double && num2 instanceof Integer){
            return num1.doubleValue()+num2.intValue();
        }else if(num1 instanceof Double && num2 instanceof Short){
            return num1.doubleValue()+num2.shortValue();
        } else if (num1 instanceof Float && num2 instanceof Double) {
            return num1.floatValue()+num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Long) {
            return num1.floatValue()+num2.longValue();
        }else if (num1 instanceof Float && num2 instanceof Integer) {
            return num1.floatValue()+num2.intValue();
        }else if (num1 instanceof Float && num2 instanceof Short) {
            return num1.floatValue()+num2.shortValue();
        }else if (num1 instanceof Long && num2 instanceof Double) {
            return num1.longValue() + num2.doubleValue();
        }else if (num1 instanceof Long && num2 instanceof Float) {
            return num1.longValue() + num2.floatValue();
        }else if (num1 instanceof Long && num2 instanceof Integer) {
            return num1.longValue() + num2.intValue();
        }else if (num1 instanceof Long && num2 instanceof Short) {
            return num1.longValue() + num2.shortValue();
        }else if(num1 instanceof Integer && num2 instanceof Double){
            return num1.intValue() + num2.doubleValue();
        }else if(num1 instanceof Integer && num2 instanceof Float){
            return num1.intValue() + num2.floatValue();
        }else if(num1 instanceof Integer && num2 instanceof Long){
            return num1.intValue() + num2.longValue();
        }else if(num1 instanceof Integer && num2 instanceof Short){
            return num1.intValue() + num2.shortValue();
        }else if(num1 instanceof Short && num2 instanceof Double){
            return num1.shortValue() + num2.doubleValue();
        }else if(num1 instanceof Short && num2 instanceof Long){
            return num1.shortValue() + num2.longValue();
        }else if(num1 instanceof Short && num2 instanceof Float){
            return num1.shortValue() + num2.floatValue();
        }else if(num1 instanceof Short && num2 instanceof Integer){
            return num1.shortValue() + num2.intValue();
        }
        return null;

    }
    public Number subtract() {
        if (num1 instanceof Double && num2 instanceof Double) {
            return num1.doubleValue() - num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return num1.floatValue() - num2.floatValue();
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return num1.longValue() - num2.longValue();
        } else if(num1 instanceof Integer && num2 instanceof Integer){
            return num1.intValue() - num2.intValue();
        }else if(num1 instanceof Short && num2 instanceof Short){
            return num1.shortValue() - num2.shortValue();
        } else if(num1 instanceof Double && num2 instanceof Float){
            return num1.doubleValue() - num2.floatValue();
        }else if(num1 instanceof Double && num2 instanceof Long){
            return num1.doubleValue() - num2.longValue();
        }else if(num1 instanceof Double && num2 instanceof Integer){
            return num1.doubleValue() - num2.intValue();
        }else if(num1 instanceof Double && num2 instanceof Short){
            return num1.doubleValue() - num2.shortValue();
        } else if (num1 instanceof Float && num2 instanceof Double) {
            return num1.floatValue() - num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Long) {
            return num1.floatValue() - num2.longValue();
        }else if (num1 instanceof Float && num2 instanceof Integer) {
            return num1.floatValue() - num2.intValue();
        }else if (num1 instanceof Float && num2 instanceof Short) {
            return num1.floatValue() - num2.shortValue();
        }else if (num1 instanceof Long && num2 instanceof Double) {
            return num1.longValue() - num2.doubleValue();
        }else if (num1 instanceof Long && num2 instanceof Float) {
            return num1.longValue() - num2.floatValue();
        }else if (num1 instanceof Long && num2 instanceof Integer) {
            return num1.longValue() - num2.intValue();
        }else if (num1 instanceof Long && num2 instanceof Short) {
            return num1.longValue() - num2.shortValue();
        }else if(num1 instanceof Integer && num2 instanceof Double){
            return num1.intValue() - num2.doubleValue();
        }else if(num1 instanceof Integer && num2 instanceof Float){
            return num1.intValue() - num2.floatValue();
        }else if(num1 instanceof Integer && num2 instanceof Long){
            return num1.intValue() - num2.longValue();
        }else if(num1 instanceof Integer && num2 instanceof Short){
            return num1.intValue() - num2.shortValue();
        }else if(num1 instanceof Short && num2 instanceof Double){
            return num1.shortValue() - num2.doubleValue();
        }else if(num1 instanceof Short && num2 instanceof Long){
            return num1.shortValue() - num2.longValue();
        }else if(num1 instanceof Short && num2 instanceof Float){
            return num1.shortValue() - num2.floatValue();
        }else if(num1 instanceof Short && num2 instanceof Integer){
            return num1.shortValue() - num2.intValue();
        }
        return null;


    }
    public Number multiply() {
        if (num1 instanceof Double && num2 instanceof Double) {
            return num1.doubleValue() * num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return num1.floatValue() * num2.floatValue();
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return num1.longValue() * num2.longValue();
        } else if(num1 instanceof Integer && num2 instanceof Integer){
            return num1.intValue() * num2.intValue();
        }else if(num1 instanceof Short && num2 instanceof Short){
            return num1.shortValue() * num2.shortValue();
        } else if(num1 instanceof Double && num2 instanceof Float){
            return num1.doubleValue() * num2.floatValue();
        }else if(num1 instanceof Double && num2 instanceof Long){
            return num1.doubleValue() * num2.longValue();
        }else if(num1 instanceof Double && num2 instanceof Integer){
            return num1.doubleValue() * num2.intValue();
        }else if(num1 instanceof Double && num2 instanceof Short){
            return num1.doubleValue() * num2.shortValue();
        } else if (num1 instanceof Float && num2 instanceof Double) {
            return num1.floatValue() * num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Long) {
            return num1.floatValue() * num2.longValue();
        }else if (num1 instanceof Float && num2 instanceof Integer) {
            return num1.floatValue() * num2.intValue();
        }else if (num1 instanceof Float && num2 instanceof Short) {
            return num1.floatValue() * num2.shortValue();
        }else if (num1 instanceof Long && num2 instanceof Double) {
            return num1.longValue() * num2.doubleValue();
        }else if (num1 instanceof Long && num2 instanceof Float) {
            return num1.longValue() * num2.floatValue();
        }else if (num1 instanceof Long && num2 instanceof Integer) {
            return num1.longValue() * num2.intValue();
        }else if (num1 instanceof Long && num2 instanceof Short) {
            return num1.longValue() * num2.shortValue();
        }else if(num1 instanceof Integer && num2 instanceof Double){
            return num1.intValue() * num2.doubleValue();
        }else if(num1 instanceof Integer && num2 instanceof Float){
            return num1.intValue() * num2.floatValue();
        }else if(num1 instanceof Integer && num2 instanceof Long){
            return num1.intValue() * num2.longValue();
        }else if(num1 instanceof Integer && num2 instanceof Short){
            return num1.intValue() * num2.shortValue();
        }else if(num1 instanceof Short && num2 instanceof Double){
            return num1.shortValue() * num2.doubleValue();
        }else if(num1 instanceof Short && num2 instanceof Long){
            return num1.shortValue() * num2.longValue();
        }else if(num1 instanceof Short && num2 instanceof Float){
            return num1.shortValue() * num2.floatValue();
        }else if(num1 instanceof Short && num2 instanceof Integer){
            return num1.shortValue() * num2.intValue();
        }
        return null;

    }

    public Number divide() {
        if((num2 instanceof Integer || num2 instanceof Long || num2 instanceof Short)&&num2.intValue()==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (num1 instanceof Double && num2 instanceof Double) {
            return num1.doubleValue() / num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return num1.floatValue() / num2.floatValue();
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return num1.longValue() / num2.longValue();
        } else if(num1 instanceof Integer && num2 instanceof Integer){
            return num1.intValue() / num2.intValue();
        }else if(num1 instanceof Short && num2 instanceof Short){
            return num1.shortValue() / num2.shortValue();
        } else if(num1 instanceof Double && num2 instanceof Float){
            return num1.doubleValue() / num2.floatValue();
        }else if(num1 instanceof Double && num2 instanceof Long){
            return num1.doubleValue() / num2.longValue();
        }else if(num1 instanceof Double && num2 instanceof Integer){
            return num1.doubleValue() / num2.intValue();
        }else if(num1 instanceof Double && num2 instanceof Short){
            return num1.doubleValue() / num2.shortValue();
        } else if (num1 instanceof Float && num2 instanceof Double) {
            return num1.floatValue() / num2.doubleValue();
        } else if (num1 instanceof Float && num2 instanceof Long) {
            return num1.floatValue() / num2.longValue();
        }else if (num1 instanceof Float && num2 instanceof Integer) {
            return num1.floatValue() / num2.intValue();
        }else if (num1 instanceof Float && num2 instanceof Short) {
            return num1.floatValue() / num2.shortValue();
        }else if (num1 instanceof Long && num2 instanceof Double) {
            return num1.longValue() / num2.doubleValue();
        }else if (num1 instanceof Long && num2 instanceof Float) {
            return num1.longValue() / num2.floatValue();
        }else if (num1 instanceof Long && num2 instanceof Integer) {
            return num1.longValue() / num2.intValue();
        }else if (num1 instanceof Long && num2 instanceof Short) {
            return num1.longValue() / num2.shortValue();
        }else if(num1 instanceof Integer && num2 instanceof Double){
            return num1.intValue() / num2.doubleValue();
        }else if(num1 instanceof Integer && num2 instanceof Float){
            return num1.intValue() / num2.floatValue();
        }else if(num1 instanceof Integer && num2 instanceof Long){
            return num1.intValue() / num2.longValue();
        }else if(num1 instanceof Integer && num2 instanceof Short){
            return num1.intValue() / num2.shortValue();
        }else if(num1 instanceof Short && num2 instanceof Double){
            return num1.shortValue() / num2.doubleValue();
        }else if(num1 instanceof Short && num2 instanceof Long){
            return num1.shortValue() / num2.longValue();
        }else if(num1 instanceof Short && num2 instanceof Float){
            return num1.shortValue() / num2.floatValue();
        }else if(num1 instanceof Short && num2 instanceof Integer){
            return num1.shortValue() / num2.intValue();
        }
        return null;

    }

    public Number getMin() {
        if (num1.doubleValue() <= num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }

    public Number getMax() {
        if (num1.doubleValue() >= num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }

}

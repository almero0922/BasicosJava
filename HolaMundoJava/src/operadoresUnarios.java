
public class operadoresUnarios {
        public static void main (String args[]){
            var a = 3;
            var b = -a;
            
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            
            var c = true;
            var d = !c;
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            
            var e = 4;
            var f = ++e;
            var g = e++;
            System.out.println("e = " + e);
            System.out.println("f = " + f);
            System.out.println("g = " + g);
            
            var h = 10;
            var i = --h;
            var j = h--;
            System.out.println("h = " + h);
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
}

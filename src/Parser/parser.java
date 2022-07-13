package Parser;

import AbstractSyntaxTree.*;
import java_cup.runtime.*;

public class parser extends java_cup.runtime.lr_parser {

/** Default constructor. */
public parser() {super();}

/** Constructor which sets the default scanner. */
public parser(java_cup.runtime.Scanner s) {super(s);}

/** Constructor which sets the default scanner. */
public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

/** Production table. */
protected static final short _production_table[][] = 
  unpackFromStrings(new String[] {
  "\000\102\000\002\002\004\000\002\002\004\000\002\003" +
  "\023\000\002\004\003\000\002\004\002\000\002\005\003" +
  "\000\002\005\004\000\002\006\007\000\002\006\010\000" +
  "\002\006\011\000\002\006\012\000\002\007\003\000\002" +
  "\007\002\000\002\010\003\000\002\010\004\000\002\011" +
  "\016\000\002\011\017\000\002\022\003\000\002\022\002" +
  "\000\002\023\003\000\002\023\005\000\002\024\003\000" +
  "\002\024\004\000\002\025\004\000\002\026\005\000\002" +
  "\032\005\000\002\032\003\000\002\032\003\000\002\032" +
  "\003\000\002\014\005\000\002\014\003\000\002\014\003" +
  "\000\002\014\003\000\002\014\003\000\002\014\003\000" +
  "\002\012\003\000\002\012\002\000\002\013\003\000\002" +
  "\013\004\000\002\015\006\000\002\017\007\000\002\020" +
  "\011\000\002\021\011\000\002\016\005\000\002\031\003" +
  "\000\002\031\005\000\002\031\005\000\002\031\005\000" +
  "\002\031\005\000\002\031\005\000\002\031\006\000\002" +
  "\031\005\000\002\031\010\000\002\031\003\000\002\031" +
  "\003\000\002\031\003\000\002\031\003\000\002\031\007" +
  "\000\002\031\006\000\002\031\004\000\002\031\005\000" +
  "\002\027\003\000\002\027\002\000\002\030\003\000\002" +
  "\030\005\000\002\033\003" });

/** Access to production table. */
public short[][] production_table() {return _production_table;}

/** Parse-action table. */
protected static final short[][] _action_table = 
  unpackFromStrings(new String[] {
  "\000\235\000\004\045\006\001\002\000\004\002\237\001" +
  "\002\000\006\002\ufffd\045\147\001\002\000\004\024\007" +
  "\001\002\000\024\006\uffc0\014\uffc0\015\uffc0\016\uffc0\020" +
  "\uffc0\022\uffc0\023\uffc0\024\uffc0\046\uffc0\001\002\000\004" +
  "\020\011\001\002\000\004\043\012\001\002\000\004\044" +
  "\013\001\002\000\004\033\014\001\002\000\004\047\015" +
  "\001\002\000\004\014\016\001\002\000\004\032\017\001" +
  "\002\000\004\016\020\001\002\000\004\017\021\001\002" +
  "\000\004\024\007\001\002\000\004\015\023\001\002\000" +
  "\004\020\024\001\002\000\014\004\035\020\031\024\007" +
  "\034\025\035\032\001\002\000\004\014\141\001\002\000" +
  "\022\004\uffe1\020\uffe1\021\uffe1\024\uffe1\034\uffe1\035\uffe1" +
  "\036\uffe1\050\uffe1\001\002\000\006\006\130\016\131\001" +
  "\002\000\022\004\uffe3\020\uffe3\021\uffe3\024\uffe3\034\uffe3" +
  "\035\uffe3\036\uffe3\050\uffe3\001\002\000\016\004\035\020" +
  "\031\021\uffdd\024\007\034\025\035\032\001\002\000\004" +
  "\014\115\001\002\000\022\004\uffe2\020\uffe2\021\uffe2\024" +
  "\uffe2\034\uffe2\035\uffe2\036\uffe2\050\uffe2\001\002\000\004" +
  "\021\113\001\002\000\022\012\047\014\050\024\046\025" +
  "\040\026\042\027\044\041\041\042\045\001\002\000\022" +
  "\004\uffe0\020\uffe0\021\uffe0\024\uffe0\034\uffe0\035\uffe0\036" +
  "\uffe0\050\uffe0\001\002\000\022\004\uffdf\020\uffdf\021\uffdf" +
  "\024\uffdf\034\uffdf\035\uffdf\036\uffdf\050\uffdf\001\002\000" +
  "\030\005\uffd5\007\uffd5\010\uffd5\011\uffd5\013\uffd5\015\uffd5" +
  "\016\uffd5\017\uffd5\022\uffd5\023\uffd5\037\uffd5\001\002\000" +
  "\006\024\007\030\105\001\002\000\030\005\uffcc\007\uffcc" +
  "\010\uffcc\011\uffcc\013\uffcc\015\uffcc\016\uffcc\017\uffcc\022" +
  "\uffcc\023\uffcc\037\uffcc\001\002\000\022\005\055\007\052" +
  "\010\057\011\054\013\056\016\060\022\103\037\061\001" +
  "\002\000\030\005\uffcb\007\uffcb\010\uffcb\011\uffcb\013\uffcb" +
  "\015\uffcb\016\uffcb\017\uffcb\022\uffcb\023\uffcb\037\uffcb\001" +
  "\002\000\030\005\uffc9\007\uffc9\010\uffc9\011\uffc9\013\uffc9" +
  "\015\uffc9\016\uffc9\017\uffc9\022\uffc9\023\uffc9\037\uffc9\001" +
  "\002\000\030\005\uffca\007\uffca\010\uffca\011\uffca\013\uffca" +
  "\015\uffca\016\uffca\017\uffca\022\uffca\023\uffca\037\uffca\001" +
  "\002\000\022\012\047\014\050\024\046\025\040\026\042" +
  "\027\044\041\041\042\045\001\002\000\022\012\047\014" +
  "\050\024\046\025\040\026\042\027\044\041\041\042\045" +
  "\001\002\000\022\005\055\007\052\010\057\011\054\013" +
  "\056\015\053\016\060\037\061\001\002\000\022\012\047" +
  "\014\050\024\046\025\040\026\042\027\044\041\041\042" +
  "\045\001\002\000\030\005\uffc5\007\uffc5\010\uffc5\011\uffc5" +
  "\013\uffc5\015\uffc5\016\uffc5\017\uffc5\022\uffc5\023\uffc5\037" +
  "\uffc5\001\002\000\022\012\047\014\050\024\046\025\040" +
  "\026\042\027\044\041\041\042\045\001\002\000\022\012" +
  "\047\014\050\024\046\025\040\026\042\027\044\041\041" +
  "\042\045\001\002\000\022\012\047\014\050\024\046\025" +
  "\040\026\042\027\044\041\041\042\045\001\002\000\022" +
  "\012\047\014\050\024\046\025\040\026\042\027\044\041" +
  "\041\042\045\001\002\000\022\012\047\014\050\024\046" +
  "\025\040\026\042\027\044\041\041\042\045\001\002\000" +
  "\006\024\007\040\062\001\002\000\030\005\uffce\007\uffce" +
  "\010\uffce\011\uffce\013\uffce\015\uffce\016\uffce\017\uffce\022" +
  "\uffce\023\uffce\037\uffce\001\002\000\004\014\064\001\002" +
  "\000\024\012\047\014\050\015\uffc3\024\046\025\040\026" +
  "\042\027\044\041\041\042\045\001\002\000\004\015\072" +
  "\001\002\000\024\005\055\007\052\010\057\011\054\013" +
  "\056\015\uffc2\016\060\023\uffc2\037\061\001\002\000\006" +
  "\015\uffc4\023\070\001\002\000\022\012\047\014\050\024" +
  "\046\025\040\026\042\027\044\041\041\042\045\001\002" +
  "\000\024\005\055\007\052\010\057\011\054\013\056\015" +
  "\uffc1\016\060\023\uffc1\037\061\001\002\000\030\005\uffcd" +
  "\007\uffcd\010\uffcd\011\uffcd\013\uffcd\015\uffcd\016\uffcd\017" +
  "\uffcd\022\uffcd\023\uffcd\037\uffcd\001\002\000\022\005\055" +
  "\007\052\010\057\011\054\013\056\016\060\017\074\037" +
  "\061\001\002\000\030\005\uffcf\007\uffcf\010\uffcf\011\uffcf" +
  "\013\uffcf\015\uffcf\016\uffcf\017\uffcf\022\uffcf\023\uffcf\037" +
  "\uffcf\001\002\000\030\005\055\007\052\010\uffd3\011\uffd3" +
  "\013\056\015\uffd3\016\060\017\uffd3\022\uffd3\023\uffd3\037" +
  "\061\001\002\000\030\005\uffd1\007\052\010\uffd1\011\uffd1" +
  "\013\uffd1\015\uffd1\016\060\017\uffd1\022\uffd1\023\uffd1\037" +
  "\061\001\002\000\030\005\uffd2\007\052\010\uffd2\011\uffd2" +
  "\013\uffd2\015\uffd2\016\060\017\uffd2\022\uffd2\023\uffd2\037" +
  "\061\001\002\000\030\005\055\007\052\010\057\011\uffd4" +
  "\013\056\015\uffd4\016\060\017\uffd4\022\uffd4\023\uffd4\037" +
  "\061\001\002\000\030\005\uffd0\007\uffd0\010\uffd0\011\uffd0" +
  "\013\uffd0\015\uffd0\016\060\017\uffd0\022\uffd0\023\uffd0\037" +
  "\061\001\002\000\030\005\uffc6\007\uffc6\010\uffc6\011\uffc6" +
  "\013\uffc6\015\uffc6\016\060\017\uffc6\022\uffc6\023\uffc6\037" +
  "\061\001\002\000\022\004\uffd6\020\uffd6\021\uffd6\024\uffd6" +
  "\034\uffd6\035\uffd6\036\uffd6\050\uffd6\001\002\000\004\014" +
  "\111\001\002\000\004\016\106\001\002\000\022\012\047" +
  "\014\050\024\046\025\040\026\042\027\044\041\041\042" +
  "\045\001\002\000\022\005\055\007\052\010\057\011\054" +
  "\013\056\016\060\017\110\037\061\001\002\000\030\005" +
  "\uffc8\007\uffc8\010\uffc8\011\uffc8\013\uffc8\015\uffc8\016\uffc8" +
  "\017\uffc8\022\uffc8\023\uffc8\037\uffc8\001\002\000\004\015" +
  "\112\001\002\000\030\005\uffc7\007\uffc7\010\uffc7\011\uffc7" +
  "\013\uffc7\015\uffc7\016\uffc7\017\uffc7\022\uffc7\023\uffc7\037" +
  "\uffc7\001\002\000\004\021\114\001\002\000\006\002\uffff" +
  "\045\uffff\001\002\000\022\012\047\014\050\024\046\025" +
  "\040\026\042\027\044\041\041\042\045\001\002\000\022" +
  "\005\055\007\052\010\057\011\054\013\056\015\117\016" +
  "\060\037\061\001\002\000\014\004\035\020\031\024\007" +
  "\034\025\035\032\001\002\000\004\036\121\001\002\000" +
  "\014\004\035\020\031\024\007\034\025\035\032\001\002" +
  "\000\022\004\uffd8\020\uffd8\021\uffd8\024\uffd8\034\uffd8\035" +
  "\uffd8\036\uffd8\050\uffd8\001\002\000\004\021\127\001\002" +
  "\000\020\004\035\020\031\021\uffde\024\007\034\025\035" +
  "\032\050\uffde\001\002\000\020\004\uffdc\020\uffdc\021\uffdc" +
  "\024\uffdc\034\uffdc\035\uffdc\050\uffdc\001\002\000\020\004" +
  "\uffdb\020\uffdb\021\uffdb\024\uffdb\034\uffdb\035\uffdb\050\uffdb" +
  "\001\002\000\022\004\uffe4\020\uffe4\021\uffe4\024\uffe4\034" +
  "\uffe4\035\uffe4\036\uffe4\050\uffe4\001\002\000\022\012\047" +
  "\014\050\024\046\025\040\026\042\027\044\041\041\042" +
  "\045\001\002\000\022\012\047\014\050\024\046\025\040" +
  "\026\042\027\044\041\041\042\045\001\002\000\022\005" +
  "\055\007\052\010\057\011\054\013\056\016\060\017\133" +
  "\037\061\001\002\000\004\006\134\001\002\000\022\012" +
  "\047\014\050\024\046\025\040\026\042\027\044\041\041" +
  "\042\045\001\002\000\022\005\055\007\052\010\057\011" +
  "\054\013\056\016\060\022\136\037\061\001\002\000\022" +
  "\004\uffd7\020\uffd7\021\uffd7\024\uffd7\034\uffd7\035\uffd7\036" +
  "\uffd7\050\uffd7\001\002\000\022\005\055\007\052\010\057" +
  "\011\054\013\056\016\060\022\140\037\061\001\002\000" +
  "\022\004\uffda\020\uffda\021\uffda\024\uffda\034\uffda\035\uffda" +
  "\036\uffda\050\uffda\001\002\000\022\012\047\014\050\024" +
  "\046\025\040\026\042\027\044\041\041\042\045\001\002" +
  "\000\022\005\055\007\052\010\057\011\054\013\056\015" +
  "\143\016\060\037\061\001\002\000\014\004\035\020\031" +
  "\024\007\034\025\035\032\001\002\000\022\004\uffd9\020" +
  "\uffd9\021\uffd9\024\uffd9\034\uffd9\035\uffd9\036\uffd9\050\uffd9" +
  "\001\002\000\004\002\001\001\002\000\006\002\ufffc\045" +
  "\ufffc\001\002\000\004\024\007\001\002\000\006\002\ufffe" +
  "\045\147\001\002\000\006\002\ufffb\045\ufffb\001\002\000" +
  "\006\020\153\046\154\001\002\000\014\021\ufff5\024\007" +
  "\030\160\031\163\043\162\001\002\000\004\024\007\001" +
  "\002\000\004\020\156\001\002\000\014\021\ufff5\024\007" +
  "\030\160\031\163\043\162\001\002\000\004\024\007\001" +
  "\002\000\006\016\226\024\uffe6\001\002\000\014\021\ufff5" +
  "\024\007\030\160\031\163\043\162\001\002\000\010\024" +
  "\007\030\160\031\163\001\002\000\004\024\uffe7\001\002" +
  "\000\006\021\ufff4\043\ufff4\001\002\000\026\004\uffec\020" +
  "\uffec\021\uffec\024\uffec\030\uffec\031\uffec\034\uffec\035\uffec" +
  "\043\uffec\050\uffec\001\002\000\004\024\uffe5\001\002\000" +
  "\004\021\172\001\002\000\006\021\ufff6\043\162\001\002" +
  "\000\006\021\ufff3\043\ufff3\001\002\000\006\002\ufff8\045" +
  "\ufff8\001\002\000\004\024\007\001\002\000\004\014\175" +
  "\001\002\000\012\015\uffef\024\007\030\160\031\163\001" +
  "\002\000\004\015\205\001\002\000\004\024\007\001\002" +
  "\000\006\015\uffee\023\uffee\001\002\000\006\015\ufff0\023" +
  "\202\001\002\000\010\024\007\030\160\031\163\001\002" +
  "\000\006\015\uffed\023\uffed\001\002\000\006\015\uffea\023" +
  "\uffea\001\002\000\004\020\206\001\002\000\022\004\035" +
  "\020\031\024\007\030\160\031\163\034\025\035\032\050" +
  "\uffdd\001\002\000\022\004\035\020\031\024\007\030\160" +
  "\031\163\034\025\035\032\050\uffdd\001\002\000\010\006" +
  "\130\016\131\024\uffe5\001\002\000\004\050\212\001\002" +
  "\000\022\012\047\014\050\024\046\025\040\026\042\027" +
  "\044\041\041\042\045\001\002\000\022\005\055\007\052" +
  "\010\057\011\054\013\056\016\060\022\214\037\061\001" +
  "\002\000\004\021\215\001\002\000\006\021\ufff2\043\ufff2" +
  "\001\002\000\026\004\uffeb\020\uffeb\021\uffeb\024\uffeb\030" +
  "\uffeb\031\uffeb\034\uffeb\035\uffeb\043\uffeb\050\uffeb\001\002" +
  "\000\004\050\220\001\002\000\022\012\047\014\050\024" +
  "\046\025\040\026\042\027\044\041\041\042\045\001\002" +
  "\000\022\005\055\007\052\010\057\011\054\013\056\016" +
  "\060\022\222\037\061\001\002\000\004\021\223\001\002" +
  "\000\006\021\ufff1\043\ufff1\001\002\000\004\021\225\001" +
  "\002\000\006\002\ufff7\045\ufff7\001\002\000\004\017\227" +
  "\001\002\000\004\024\uffe8\001\002\000\004\022\231\001" +
  "\002\000\026\004\uffe9\020\uffe9\021\uffe9\024\uffe9\030\uffe9" +
  "\031\uffe9\034\uffe9\035\uffe9\043\uffe9\050\uffe9\001\002\000" +
  "\014\021\ufff5\024\007\030\160\031\163\043\162\001\002" +
  "\000\004\021\234\001\002\000\006\002\ufffa\045\ufffa\001" +
  "\002\000\004\021\236\001\002\000\006\002\ufff9\045\ufff9" +
  "\001\002\000\004\002\000\001\002" });

/** Access to parse-action table. */
public short[][] action_table() {return _action_table;}

/** <code>reduce_goto</code> table. */
protected static final short[][] _reduce_table = 
  unpackFromStrings(new String[] {
  "\000\235\000\006\002\003\003\004\001\001\000\002\001" +
  "\001\000\010\004\144\005\147\006\145\001\001\000\004" +
  "\033\007\001\001\000\002\001\001\000\002\001\001\000" +
  "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
  "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
  "\001\000\002\001\001\000\004\033\021\001\001\000\002" +
  "\001\001\000\002\001\001\000\020\014\033\015\035\016" +
  "\025\017\032\020\027\021\036\033\026\001\001\000\002" +
  "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
  "\001\000\024\012\122\013\123\014\124\015\035\016\025" +
  "\017\032\020\027\021\036\033\026\001\001\000\002\001" +
  "\001\000\002\001\001\000\002\001\001\000\004\031\042" +
  "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
  "\001\000\004\033\103\001\001\000\002\001\001\000\002" +
  "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
  "\001\000\004\031\101\001\001\000\004\031\050\001\001" +
  "\000\002\001\001\000\004\031\100\001\001\000\002\001" +
  "\001\000\004\031\077\001\001\000\004\031\076\001\001" +
  "\000\004\031\075\001\001\000\004\031\074\001\001\000" +
  "\004\031\072\001\001\000\004\033\062\001\001\000\002" +
  "\001\001\000\002\001\001\000\010\027\064\030\066\031" +
  "\065\001\001\000\002\001\001\000\002\001\001\000\002" +
  "\001\001\000\004\031\070\001\001\000\002\001\001\000" +
  "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
  "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
  "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
  "\000\002\001\001\000\002\001\001\000\004\031\106\001" +
  "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
  "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
  "\004\031\115\001\001\000\002\001\001\000\020\014\117" +
  "\015\035\016\025\017\032\020\027\021\036\033\026\001" +
  "\001\000\002\001\001\000\020\014\121\015\035\016\025" +
  "\017\032\020\027\021\036\033\026\001\001\000\002\001" +
  "\001\000\002\001\001\000\020\014\125\015\035\016\025" +
  "\017\032\020\027\021\036\033\026\001\001\000\002\001" +
  "\001\000\002\001\001\000\002\001\001\000\004\031\136" +
  "\001\001\000\004\031\131\001\001\000\002\001\001\000" +
  "\002\001\001\000\004\031\134\001\001\000\002\001\001" +
  "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
  "\004\031\141\001\001\000\002\001\001\000\020\014\143" +
  "\015\035\016\025\017\032\020\027\021\036\033\026\001" +
  "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
  "\000\004\033\151\001\001\000\004\006\150\001\001\000" +
  "\002\001\001\000\002\001\001\000\020\007\232\010\167" +
  "\011\163\024\231\026\164\032\156\033\165\001\001\000" +
  "\004\033\154\001\001\000\002\001\001\000\020\007\166" +
  "\010\167\011\163\024\160\026\164\032\156\033\165\001" +
  "\001\000\004\033\227\001\001\000\002\001\001\000\016" +
  "\007\223\010\167\011\163\026\215\032\156\033\165\001" +
  "\001\000\006\032\172\033\165\001\001\000\002\001\001" +
  "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
  "\002\001\001\000\004\011\170\001\001\000\002\001\001" +
  "\000\002\001\001\000\004\033\173\001\001\000\002\001" +
  "\001\000\014\022\175\023\200\025\177\032\176\033\165" +
  "\001\001\000\002\001\001\000\004\033\203\001\001\000" +
  "\002\001\001\000\002\001\001\000\010\025\202\032\176" +
  "\033\165\001\001\000\002\001\001\000\002\001\001\000" +
  "\002\001\001\000\032\012\210\013\123\014\124\015\035" +
  "\016\025\017\032\020\027\021\036\024\206\026\164\032" +
  "\156\033\207\001\001\000\030\012\216\013\123\014\124" +
  "\015\035\016\025\017\032\020\027\021\036\026\215\032" +
  "\156\033\207\001\001\000\002\001\001\000\002\001\001" +
  "\000\004\031\212\001\001\000\002\001\001\000\002\001" +
  "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
  "\000\004\031\220\001\001\000\002\001\001\000\002\001" +
  "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
  "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
  "\002\001\001\000\016\007\234\010\167\011\163\026\215" +
  "\032\156\033\165\001\001\000\002\001\001\000\002\001" +
  "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
  "" });

/** Access to <code>reduce_goto</code> table. */
public short[][] reduce_table() {return _reduce_table;}

/** Instance of action encapsulation class. */
protected CUP$parser$actions action_obj;

/** Action encapsulation object initializer. */
protected void init_actions()
  {
    action_obj = new CUP$parser$actions(this);
  }

/** Invoke a user supplied parse action. */
public java_cup.runtime.Symbol do_action(
  int                        act_num,
  java_cup.runtime.lr_parser parser,
  java.util.Stack            stack,
  int                        top)
  throws java.lang.Exception
{
  /* call code in generated class */
  return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
}

/** Indicates start state. */
public int start_state() {return 0;}
/** Indicates start production. */
public int start_production() {return 1;}

/** <code>EOF</code> Symbol index. */
public int EOF_sym() {return 0;}

/** <code>error</code> Symbol index. */
public int error_sym() {return 1;}



/* Override default error message routine to handle line numbers correctly */
/* This routine is also called in the process of handling fatal errors. */

/** Report a non fatal error (or warning).  This method takes a message 
 *  string and an additional object (to be used by specializations 
 *  implemented in subclasses).  Prints the same simple error message
 *  as the base class version, but correctly labels the line number.
 *
 * @param message an error message.
 * @param info    an extra object reserved for use by specialized subclasses.
 */
public void report_error(String message, Object info)
  {
    System.err.print(message);
    System.err.flush();
    if (info instanceof Symbol)
	if (((Symbol)info).left != -1)
	  System.err.println(" na linha: " + ((Symbol)info).left +" na coluna: "+((Symbol)info).right+
			     " do input");
	else System.err.println("");
    else System.err.println("");
  }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
private final parser parser;

/** Constructor */
CUP$parser$actions(parser parser) {
  this.parser = parser;
}

/** Method with the actual generated action code. */
public final java_cup.runtime.Symbol CUP$parser$do_action(
  int                        CUP$parser$act_num,
  java_cup.runtime.lr_parser CUP$parser$parser,
  java.util.Stack            CUP$parser$stack,
  int                        CUP$parser$top)
  throws java.lang.Exception
  {
    /* Symbol object for return from actions */
    java_cup.runtime.Symbol CUP$parser$result;

    /* select the action based on the action number */
    switch (CUP$parser$act_num)
      {
        /*. . . . . . . . . . . . . . . . . . . .*/
        case 65: // Identifier ::= IDENTIFIER 
          {
            Identifier RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Identifier(id, idleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Identifier",25, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 64: // NonEmptyAL ::= NonEmptyAL COMMA Expression 
          {
            ExpList RESULT =null;
		int alleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int alright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpList al = (ExpList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 al.add(expr);
                  RESULT = al; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyAL",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 63: // NonEmptyAL ::= Expression 
          {
            ExpList RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 ExpList elist = new ExpList(exprleft);
                  elist.add(expr);
                  RESULT = elist; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyAL",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 62: // ArgumentList ::= 
          {
            ExpList RESULT =null;
		 RESULT = new ExpList(0); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ArgumentList",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 61: // ArgumentList ::= NonEmptyAL 
          {
            ExpList RESULT =null;
		int agleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int agright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpList ag = (ExpList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = ag; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ArgumentList",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 60: // Expression ::= LPAREN Expression RPAREN 
          {
            Exp RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = expr; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 59: // Expression ::= NOT Expression 
          {
            Exp RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Not(expr, exprleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 58: // Expression ::= NEW Identifier LPAREN RPAREN 
          {
            Exp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new NewObject(id, nleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 57: // Expression ::= NEW INT LBRACKET Expression RBRACKET 
          {
            Exp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new NewArray(expr, nleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 56: // Expression ::= THIS 
          {
            Exp RESULT =null;
		int thsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int thsright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object ths = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new This(thsleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 55: // Expression ::= IDENTIFIER 
          {
            Exp RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IdentifierExp(name, nameleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 54: // Expression ::= FALSE 
          {
            Exp RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new False(fleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 53: // Expression ::= TRUE 
          {
            Exp RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new True(tleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 52: // Expression ::= Expression DOT Identifier LPAREN ArgumentList RPAREN 
          {
            Exp RESULT =null;
		int expr1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int expr1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Exp expr1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int argsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int argsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ExpList args = (ExpList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Call(expr1, id, args, expr1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 51: // Expression ::= Expression DOT LENGTH 
          {
            Exp RESULT =null;
		int argleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int argright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp arg = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new ArrayLength(arg, argleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 50: // Expression ::= Expression LBRACKET Expression RBRACKET 
          {
            Exp RESULT =null;
		int arg1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Exp arg1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int arg2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int arg2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp arg2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ArrayLookup(arg1, arg2, arg1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 49: // Expression ::= Expression MULT Expression 
          {
            Exp RESULT =null;
		int arg1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp arg1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int arg2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int arg2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp arg2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Times(arg1, arg2, arg1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 48: // Expression ::= Expression MINUS Expression 
          {
            Exp RESULT =null;
		int arg1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp arg1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int arg2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int arg2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp arg2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Minus(arg1, arg2, arg1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 47: // Expression ::= Expression PLUS Expression 
          {
            Exp RESULT =null;
		int arg1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp arg1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int arg2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int arg2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp arg2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Plus(arg1, arg2, arg1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 46: // Expression ::= Expression LESS Expression 
          {
            Exp RESULT =null;
		int arg1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp arg1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int arg2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int arg2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp arg2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LessThan(arg1, arg2, arg1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 45: // Expression ::= Expression BAND Expression 
          {
            Exp RESULT =null;
		int arg1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int arg1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp arg1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int arg2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int arg2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp arg2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new And(arg1, arg2, arg1left); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 44: // Expression ::= INTEGER 
          {
            Exp RESULT =null;
		int intlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int intlright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String intl = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IntegerLiteral(Integer.parseInt(intl), intlleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",23, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 43: // DisplayStatement ::= PRINT Expression SEMICOLON 
          {
            Print RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Print(expr, pleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("DisplayStatement",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 42: // ArrayAssignStatement ::= Identifier LBRACKET Expression RBRACKET BECOMES Expression SEMICOLON 
          {
            ArrayAssign RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int expr1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int expr1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Exp expr1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int expr2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expr2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp expr2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ArrayAssign(id, expr1, expr2, idleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ArrayAssignStatement",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 41: // IfStatement ::= IF LPAREN Expression RPAREN Statement ELSE Statement 
          {
            If RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object i = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int s1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int s1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Statement s1 = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int s2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int s2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statement s2 = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new If(expr, s1, s2, ileft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("IfStatement",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 40: // WhileStatement ::= WHILE LPAREN Expression RPAREN Statement 
          {
            While RESULT =null;
		int wleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object w = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new While(expr, s, wleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("WhileStatement",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 39: // AssignStatement ::= Identifier BECOMES Expression SEMICOLON 
          {
            Assign RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Assign(id, expr, idleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("AssignStatement",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 38: // NonEmptySL ::= NonEmptySL Statement 
          {
            StatementList RESULT =null;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementList sl = (StatementList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 sl.add(s); RESULT = sl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptySL",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 37: // NonEmptySL ::= Statement 
          {
            StatementList RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 StatementList slist = new StatementList(sleft);
                  slist.add(s);
                  RESULT = slist; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptySL",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 36: // StatementList ::= 
          {
            StatementList RESULT =null;
		 RESULT = new StatementList(0); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("StatementList",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 35: // StatementList ::= NonEmptySL 
          {
            StatementList RESULT =null;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		StatementList sl = (StatementList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = sl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("StatementList",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 34: // Statement ::= ArrayAssignStatement 
          {
            Statement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ArrayAssign s = (ArrayAssign)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 33: // Statement ::= AssignStatement 
          {
            Statement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Assign s = (Assign)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 32: // Statement ::= DisplayStatement 
          {
            Statement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Print s = (Print)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 31: // Statement ::= WhileStatement 
          {
            Statement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		While s = (While)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 30: // Statement ::= IfStatement 
          {
            Statement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		If s = (If)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 29: // Statement ::= LCURL StatementList RCURL 
          {
            Statement RESULT =null;
		int lcleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lcright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object lc = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		StatementList s = (StatementList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new Block(s, lcleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 28: // Type ::= Identifier 
          {
            Type RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IdentifierType(id.toString(), idleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 27: // Type ::= INT 
          {
            Type RESULT =null;
		int integerleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int integerright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object integer = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IntegerType(integerleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 26: // Type ::= BOOLEAN 
          {
            Type RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BooleanType(bleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",24, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 25: // Type ::= INT LBRACKET RBRACKET 
          {
            Type RESULT =null;
		int integerleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int integerright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object integer = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new IntArrayType(integerleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",24, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 24: // VarDecl ::= Type Identifier SEMICOLON 
          {
            VarDecl RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Type type = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new VarDecl(type, id, typeleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDecl",20, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 23: // Formal ::= Type Identifier 
          {
            Formal RESULT =null;
		int typeleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Type type = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Formal(type, id, typeleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Formal",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 22: // VarDeclList ::= VarDeclList VarDecl 
          {
            VarDeclList RESULT =null;
		int vdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		VarDeclList vdl = (VarDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int vdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDecl vd = (VarDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 vdl.add(vd); RESULT = vdl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDeclList",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 21: // VarDeclList ::= VarDecl 
          {
            VarDeclList RESULT =null;
		int vdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDecl vd = (VarDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 VarDeclList vdl = new VarDeclList(vdleft);
                   vdl.add(vd);
                   RESULT = vdl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("VarDeclList",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 20: // NonEmptyFL ::= NonEmptyFL COMMA Formal 
          {
            FormalList RESULT =null;
		int flleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		FormalList fl = (FormalList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Formal f = (Formal)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 fl.add(f); RESULT = fl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyFL",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 19: // NonEmptyFL ::= Formal 
          {
            FormalList RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Formal f = (Formal)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 FormalList flist = new FormalList(fleft);
                  flist.add(f);
                  RESULT = flist; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyFL",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 18: // FormalList ::= 
          {
            FormalList RESULT =null;
		 RESULT = new FormalList(0); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("FormalList",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 17: // FormalList ::= NonEmptyFL 
          {
            FormalList RESULT =null;
		int flleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int flright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FormalList fl = (FormalList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = fl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("FormalList",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 16: // MethodDecl ::= PUBLIC Type Identifier LPAREN FormalList RPAREN LCURL VarDeclList StatementList RETURN Expression SEMICOLON RCURL 
          {
            MethodDecl RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-12)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-11)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;
		int flleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).right;
		FormalList fl = (FormalList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-8)).value;
		int vdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int vdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		VarDeclList vdl = (VarDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		StatementList sl = (StatementList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new MethodDecl(t, id, fl, vdl, sl, expr, pleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDecl",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 15: // MethodDecl ::= PUBLIC Type Identifier LPAREN FormalList RPAREN LCURL StatementList RETURN Expression SEMICOLON RCURL 
          {
            MethodDecl RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-11)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int flleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		FormalList fl = (FormalList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int slleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int slright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		StatementList sl = (StatementList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int exprleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp expr = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new MethodDecl(t, id, fl, new VarDeclList(0), sl, expr, pleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDecl",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-11)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 14: // NonEmptyMDL ::= NonEmptyMDL MethodDecl 
          {
            MethodDeclList RESULT =null;
		int mdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MethodDeclList mdl = (MethodDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int mdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MethodDecl md = (MethodDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 mdl.add(md); RESULT = mdl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyMDL",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 13: // NonEmptyMDL ::= MethodDecl 
          {
            MethodDeclList RESULT =null;
		int mdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MethodDecl md = (MethodDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 MethodDeclList mdlist = new MethodDeclList(mdleft);
                   mdlist.add(md);
                   RESULT = mdlist; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyMDL",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 12: // MethodDeclList ::= 
          {
            MethodDeclList RESULT =null;
		 RESULT = new MethodDeclList(0); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDeclList",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 11: // MethodDeclList ::= NonEmptyMDL 
          {
            MethodDeclList RESULT =null;
		int mdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		MethodDeclList mdl = (MethodDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = mdl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("MethodDeclList",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 10: // ClassDecl ::= CLASS Identifier EXTENDS Identifier LCURL VarDeclList MethodDeclList RCURL 
          {
            ClassDecl RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int id1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int id1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Identifier id1 = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int id2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int id2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Identifier id2 = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int vdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int vdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarDeclList vdl = (VarDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int mdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MethodDeclList mdl = (MethodDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ClassDeclExtends(id1, id2, vdl, mdl, cleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 9: // ClassDecl ::= CLASS Identifier EXTENDS Identifier LCURL MethodDeclList RCURL 
          {
            ClassDecl RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int id1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int id1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Identifier id1 = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int id2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int id2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Identifier id2 = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int mdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MethodDeclList mdl = (MethodDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ClassDeclExtends(id1, id2, new VarDeclList(0), mdl, cleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 8: // ClassDecl ::= CLASS Identifier LCURL VarDeclList MethodDeclList RCURL 
          {
            ClassDecl RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int vdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int vdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		VarDeclList vdl = (VarDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int mdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MethodDeclList mdl = (MethodDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ClassDeclSimple(id, vdl, mdl, cleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 7: // ClassDecl ::= CLASS Identifier LCURL MethodDeclList RCURL 
          {
            ClassDecl RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Identifier id = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int mdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MethodDeclList mdl = (MethodDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new ClassDeclSimple(id, new VarDeclList(0), mdl, cleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 6: // NonEmptyCDL ::= NonEmptyCDL ClassDecl 
          {
            ClassDeclList RESULT =null;
		int cdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ClassDeclList cdl = (ClassDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ClassDecl cd = (ClassDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 cdl.add(cd); RESULT = cdl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyCDL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 5: // NonEmptyCDL ::= ClassDecl 
          {
            ClassDeclList RESULT =null;
		int cdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ClassDecl cd = (ClassDecl)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 ClassDeclList cdlist = new ClassDeclList(cdleft);
                   cdlist.add(cd);
                   RESULT = cdlist; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("NonEmptyCDL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 4: // ClassDeclList ::= 
          {
            ClassDeclList RESULT =null;
		 RESULT = new ClassDeclList(0); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDeclList",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 3: // ClassDeclList ::= NonEmptyCDL 
          {
            ClassDeclList RESULT =null;
		int cdlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cdlright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ClassDeclList cdl = (ClassDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = cdl; 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("ClassDeclList",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 2: // MainClass ::= CLASS Identifier LCURL PUBLIC STATIC VOID MAIN LPAREN STRING LBRACKET RBRACKET Identifier RPAREN LCURL Statement RCURL RCURL 
          {
            MainClass RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-16)).value;
		int id1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-15)).left;
		int id1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-15)).right;
		Identifier id1 = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-15)).value;
		int id2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int id2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Identifier id2 = (Identifier)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Statement s = (Statement)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT =  new MainClass(id1, id2, s, cleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("MainClass",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-16)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 1: // $START ::= Program EOF 
          {
            Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
            CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        /* ACCEPT */
        CUP$parser$parser.done_parsing();
        return CUP$parser$result;

        /*. . . . . . . . . . . . . . . . . . . .*/
        case 0: // Program ::= MainClass ClassDeclList 
          {
            Program RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		MainClass m = (MainClass)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cdleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cdright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ClassDeclList cd = (ClassDeclList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Program(m, cd, mleft); 
            CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
          }
        return CUP$parser$result;

        /* . . . . . .*/
        default:
          throw new Exception(
             "Invalid action number found in internal parse table");

      }
  }
}

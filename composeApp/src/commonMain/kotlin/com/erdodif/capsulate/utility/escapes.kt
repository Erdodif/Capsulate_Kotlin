package com.erdodif.capsulate.utility

val escapes = mapOf(
    Pair("eq", "=∼∽≈≋∻∾∿≀≃⋍≂≅≌≊≡≣≐≑≒≓≔≕≖≗≘≙≚≛≜≝≞≟≍≎≏≬⋕＝"),
    Pair("eqn", "≠≁≉≄≇≆≢≭"),
    Pair("=n", "≠"),
    Pair("~", "∼～"),
    Pair("~n", "≁"),
    Pair("~~", "≈"),
    Pair("~~n", "≉"),
    Pair("~~~", "≋"),
    Pair(":~", "∻"),
    Pair("~-", "≃"),
    Pair("~-n", "≄"),
    Pair("-~", "≂"),
    Pair("~=", "≅"),
    Pair("~=n", "≇"),
    Pair("~~-", "≊"),
    Pair("==", "≡"),
    Pair("==n", "≢"),
    Pair("===", "≣"),
    Pair("=", "＝"),
    Pair(".=", "≐"),
    Pair(".=.", "≑"),
    Pair(":=", "≔"),
    Pair("=:", "≕"),
    Pair("=o", "≗"),
    Pair("(=", "≘"),
    Pair("and=", "≙"),
    Pair("or=", "≚"),
    Pair("*=", "≛"),
    Pair("t=", "≜"),
    Pair("def=", "≝"),
    Pair("m=", "≞"),
    Pair("?=", "≟"),
    //Inequality and similar symbols.
    Pair("leq", "<≪⋘≤≦≲≶≺≼≾⊂⊆⋐⊏⊑⊰⊲⊴⋖⋚⋜⋞＜"),
    Pair("leqn", "≮≰≨≴⋦≸⊀⋨⊄⊈⊊⋢⋤⋪⋬⋠"),
    Pair("geq", ">≫⋙≥≧≳≷≻≽≿⊃⊇⋑⊐⊒⊱⊳⊵⋗⋛⋝⋟＞"),
    Pair("geqn", "≯≱≩≵⋧≹⊁⋩⊅⊉⊋⋣⋥⋫⋭⋡"),
    Pair("<=", "≤"),
    Pair(">=", "≥"),
    Pair("<=n", "≰"),
    Pair(">=n", "≱"),
    Pair("len", "≰"),
    Pair("gen", "≱"),
    Pair("<n", "≮"),
    Pair(">n", "≯"),
    Pair("<~", "≲"),
    Pair(">~", "≳"),
    Pair("<~n", "⋦"),
    Pair(">~n", "⋧"),
    Pair("<~nn", "≴"),
    Pair(">~nn", "≵"),
    Pair("sub", "⊂"),
    Pair("sup", "⊃"),
    Pair("subn", "⊄"),
    Pair("supn", "⊅"),
    Pair("sub=", "⊆"),
    Pair("sup=", "⊇"),
    Pair("sub=n", "⊈"),
    Pair("sup=n", "⊉"),
    Pair("squb", "⊏"),
    Pair("squp", "⊐"),
    Pair("squb=", "⊑"),
    Pair("squp=", "⊒"),
    Pair("squb=n", "⋢"),
    Pair("squp=n", "⋣"),
    Pair("member", "∈∉∊∋∌∍⋲⋳⋴⋵⋶⋷⋸⋹⋺⋻⋼⋽⋾⋿"),
    Pair("inn", "∉"),
    Pair("nin", "∌"),
    //Intersections, unions etc.
    Pair("intersection", "∩⋂∧⋀⋏⨇⊓⨅⋒∏⊼⨉"),
    Pair("union", "∪⋃∨⋁⋎⨈⊔⨆⋓∐⨿⊽⊻⊍⨃⊎⨄⊌∑⅀"),
    Pair("and", "∧"),
    Pair("or", "∨"),
    Pair("And", "⋀"),
    Pair("Or", "⋁"),
    Pair("i", "∩"),
    Pair("un", "∪"),
    Pair("u+", "⊎"),
    Pair("u.", "⊍"),
    Pair("I", "⋂"),
    Pair("Un", "⋃"),
    Pair("U+", "⨄"),
    Pair("U.", "⨃"),
    Pair("glb", "⊓"),
    Pair("lub", "⊔"),
    Pair("Glb", "⨅"),
    Pair("Lub", "⨆"),
    //Entailment etc.
    Pair("entails", "⊢⊣⊤⊥⊦⊧⊨⊩⊪⊫⊬⊭⊮⊯"),
    Pair("|-", "⊢"),
    Pair("|-n", "⊬"),
    Pair("-|", "⊣"),
    Pair("|=", "⊨"),
    Pair("|=n", "⊭"),
    Pair("||-", "⊩"),
    Pair("||-n", "⊮"),
    Pair("||=", "⊫"),
    Pair("||=n", "⊯"),
    Pair("|||-", "⊪"),
    //Divisibility, parallelity.
    Pair("|", "∣"),
    Pair("|n", "∤"),
    Pair("||", "∥"),
    Pair("||n", "∦"),
    //Some symbols from logic and set theory.
    Pair("all", "∀"),
    Pair("ex", "∃"),
    Pair("exn", "∄"),
    Pair("0", "∅"),
    Pair("C", "∁"),
    Pair("uin", "⟒"),
    Pair("din", "⫙"),
    //Corners, ceilings and floors.
    Pair("c", "⌜⌝⌞⌟⌈⌉⌊⌋"),
    Pair("cu", "⌜⌝⌈⌉"),
    Pair("cl", "⌞⌟⌊⌋"),
    Pair("cul", "⌜"),
    Pair("cuL", "⌈"),
    Pair("cur", "⌝"),
    Pair("cuR", "⌉"),
    Pair("cll", "⌞"),
    Pair("clL", "⌊"),
    Pair("clr", "⌟"),
    Pair("clR", "⌋"),
    //Various operators/symbols.
    Pair("qed", "∎"),
    Pair("x", "×"),
    Pair("o", "∘"),
    Pair("comp", "∘"),
    Pair(".", "∙．"),
    Pair("*", "⋆"),
    Pair(".+", "∔"),
    Pair(".-", "∸"),
    Pair(":", "∶⦂ː꞉˸፥፦：﹕︓"),
    Pair(",", "ʻ،⸲⸴⹁⹉、︐︑﹐﹑，､"),
    Pair(";", "⨾⨟⁏፤꛶；︔﹔⍮⸵;"),
    Pair("::", "∷"),
    Pair("::-", "∺"),
    Pair("-:", "∹"),
    Pair("+", "⊹"),
    Pair("+", "＋"),
    Pair("sqrt", "√"),
    Pair("surd", "√"),
    Pair("surd3", "∛"),
    Pair("surd4", "∜"),
    Pair("increment", "∆"),
    Pair("inf", "∞"),
    Pair("&", "⅋﹠＆"),
    Pair("z;", "⨟⨾"),
    Pair("z:", "⦂"),
    Pair("at", "@﹫＠"),
    //Circled operators.
    Pair("o+", "⊕"),
    Pair("o--", "⊖"),
    Pair("ox", "⊗"),
    Pair("o/", "⊘"),
    Pair("o.", "⊙"),
    Pair("oo", "⊚"),
    Pair("o*", "⊛"),
    Pair("o=", "⊜"),
    Pair("o-", "⊝⟜"),
    Pair("O+", "⨁"),
    Pair("Ox", "⨂"),
    Pair("O.", "⨀"),
    Pair("O*", "⍟"),
    //Boxed operators.
    Pair("b+", "⊞"),
    Pair("b-", "⊟"),
    Pair("bx", "⊠"),
    Pair("b.", "⊡"),
    Pair("b/", "⧄"),
    Pair("b\\", "⧅"),
    Pair("b*", "⧆"),
    Pair("bo", "⧇"),
    Pair("bsq", "⧈"),
    //APL boxed operators.
    Pair("box=", "⌸"),
    Pair("box?", "⍰"),
    Pair("box'", "⍞"),
    Pair("box:", "⍠"),
    Pair("box/", "⍁"),
    Pair("box\\", "⍂"),
    Pair("box<", "⍃"),
    Pair("box>", "⍄"),
    Pair("boxo", "⌻"),
    Pair("boxO", "⌼"),
    Pair("boxcomp", "⌻"),
    Pair("boxcircle", "⌼"),
    Pair("boxeq", "⌸"),
    Pair("boxneq", "⍯"),
    Pair("boxeqn", "⍯"),
    Pair("boxl", "⍇"),
    Pair("boxr", "⍈"),
    Pair("boxu", "⍐"),
    Pair("boxd", "⍗"),
    Pair("boxdi", "⌺"),
    Pair("boxdiv", "⌹"),
    Pair("boxwedge", "⍓"),
    Pair("boxvee", "⍌"),
    Pair("boxdelta", "⍍"),
    Pair("boxnabla", "⍔"),
    //Various symbols.
    Pair("integral", "∫∬∭∮∯∰∱∲∳"),
    Pair("angle", "∟∡∢⊾⊿"),
    Pair("join", "⋈⋉⋊⋋⋌⨝⟕⟖⟗"),
    Pair("esh", "ʃ"),
    //Arrows.
    Pair("l", "←⇐⇚⭅⇇⇆↤⇦↞↼↽⇠⇺↜⇽⟵⟸↚⇍⇷↹↢↩↫⇋⇜⇤⟻⟽⤆↶↺⟲"),
    Pair("r", "→⇒⇛⭆⇉⇄↦⇨↠⇀⇁⇢⇻↝⇾⟶⟹↛⇏⇸⇶↴↣↪↬⇌⇝⇥⟼⟾⤇↷↻⟳⇰⇴⟴⟿➵➸➙➔➛➜➝➞➟➠➡➢➣➤➧➨➩➪➫➬➭➮➯➱➲➳➺➻➼➽➾⊸"),
    Pair("u", "↑⇑⤊⟰⇈⇅↥⇧↟↿↾⇡⇞↰↱➦⇪⇫⇬⇭⇮⇯"),
    Pair("d", "↓⇓⤋⟱⇊⇵↧⇩↡⇃⇂⇣⇟↵↲↳➥↯"),
    Pair("ud", "↕⇕↨⇳"),
    Pair("lr", "↔⇔⇼↭⇿⟷⟺↮⇎⇹"),
    Pair("ul", "↖⇖⇱↸"),
    Pair("ur", "↗⇗➶➹➚"),
    Pair("dr", "↘⇘⇲➴➷➘"),
    Pair("dl", "↙⇙"),
    Pair("l-", "←"),
    Pair("<-", "←"),
    Pair("l=", "⇐"),
    Pair("<=", "⇐"),
    Pair("r-", "→"),
    Pair("->", "→"),
    Pair("r=", "⇒"),
    Pair("=>", "⇒"),
    Pair("u-", "↑"),
    Pair("u=", "⇑"),
    Pair("d-", "↓"),
    Pair("d=", "⇓"),
    Pair("ud-", "↕"),
    Pair("ud=", "⇕"),
    Pair("lr-", "↔"),
    Pair("<->", "↔"),
    Pair("lr=", "⇔"),
    Pair("<=>", "⇔"),
    Pair("ul-", "↖"),
    Pair("ul=", "⇖"),
    Pair("ur-", "↗"),
    Pair("ur=", "⇗"),
    Pair("dr-", "↘"),
    Pair("dr=", "⇘"),
    Pair("dl-", "↙"),
    Pair("dl=", "⇙"),
    Pair("l==", "⇚"),
    Pair("l-2", "⇇"),
    Pair("l-r-", "⇆"),
    Pair("r==", "⇛"),
    Pair("r-2", "⇉"),
    Pair("r-3", "⇶"),
    Pair("r-l-", "⇄"),
    Pair("u==", "⟰"),
    Pair("u-2", "⇈"),
    Pair("u-d-", "⇅"),
    Pair("d==", "⟱"),
    Pair("d-2", "⇊"),
    Pair("d-u-", "⇵"),
    Pair("l--", "⟵"),
    Pair("<--", "⟵"),
    Pair("r--", "⟶"),
    Pair("-->", "⟶"),
    Pair("lr--", "⟷"),
    Pair("<-->", "⟷"),
    Pair("lr~", "↭"),
    Pair("l-n", "↚"),
    Pair("<-n", "↚"),
    Pair("l=n", "⇍"),
    Pair("r-n", "↛"),
    Pair("->n", "↛"),
    Pair("r=n", "⇏"),
    Pair("=>n", "⇏"),
    Pair("lr-n", "↮"),
    Pair("<->n", "↮"),
    Pair("lr=n", "⇎"),
    Pair("<=>n", "⇎"),
    Pair("l-|", "↤"),
    Pair("ll-", "↞"),
    Pair("r-|", "↦"),
    Pair("rr-", "↠"),
    Pair("u-|", "↥"),
    Pair("uu-", "↟"),
    Pair("d-|", "↧"),
    Pair("dd-", "↡"),
    Pair("ud-|", "↨"),
    Pair("l->", "↢"),
    Pair("r->", "↣"),
    Pair("r-o", "⊸"),
    Pair("-o", "⊸"),
    Pair("l-o", "⟜"),
    Pair("dz", "↯"),
    //Ellipsis.
    Pair("...", "⋯⋮⋰⋱"),
    //Box-drawing characters.
    Pair("---", "─│┌┐└┘├┤┬┼┴╴╵╶╷╭╮╯╰╱╲╳"),
    Pair("--=", "═║╔╗╚╝╠╣╦╬╩╒╕╘╛╞╡╤╪╧╓╖╙╜╟╢╥╫╨"),
    Pair("--_", "━┃┏┓┗┛┣┫┳╋┻╸╹╺╻┍┯┑┕┷┙┝┿┥┎┰┒┖┸┚┠╂┨┞╀┦┟╁┧┢╈┪┡╇┩┮┭┶┵┾┽┲┱┺┹╊╉╆╅╄╃╿╽╼╾"),
    Pair("--.", "╌╎┄┆┈┊╍╏┅┇┉┋"),
    //Triangles.
    //Big/small, black/white.
    Pair("t", "◂◃◄◅▸▹►▻▴▵▾▿◢◿◣◺◤◸◥◹"),
    Pair("T", "◀◁▶▷▲△▼▽◬◭◮"),
    Pair("tb", "◂▸▴▾◄►◢◣◤◥"),
    Pair("tw", "◃▹▵▿◅▻◿◺◸◹"),
    Pair("Tb", "◀▶▲▼"),
    Pair("Tw", "◁▷△▽"),
    //Squares.
    Pair("sq", "■□◼◻◾◽▣▢▤▥▦▧▨▩◧◨◩◪◫◰◱◲◳"),
    Pair("sqb", "■◼◾"),
    Pair("sqw", "□◻◽"),
    Pair("sq.", "▣"),
    Pair("sqo", "▢"),
    //Rectangles.
    Pair("re", "▬▭▮▯"),
    Pair("reb", "▬▮"),
    Pair("rew", "▭▯"),
    //Parallelograms.
    Pair("pa", "▰▱"),
    Pair("pab", "▰"),
    Pair("paw", "▱"),
    //Diamonds.
    Pair("di", "◆◇◈"),
    Pair("dib", "◆"),
    Pair("diw", "◇"),
    Pair("di.", "◈"),
    //Circles.
    Pair("ci", "●○◎◌◯◍◐◑◒◓◔◕◖◗◠◡◴◵◶◷⚆⚇⚈⚉"),
    Pair("cib", "●"),
    Pair("ciw", "○"),
    Pair("ci.", "◎"),
    Pair("ci..", "◌"),
    Pair("ciO", "◯"),
    //Stars.
    Pair("st", "⋆✦✧✶✴✹★☆✪✫✯✰✵✷✸"),
    Pair("st4", "✦✧"),
    Pair("st6", "✶"),
    Pair("st8", "✴"),
    Pair("st12", "✹"),
    //Blackboard bold letters.
    Pair("bA", "𝔸"),
    Pair("bB", "𝔹"),
    Pair("bC", "ℂ"),
    Pair("bD", "𝔻"),
    Pair("bE", "𝔼"),
    Pair("bF", "𝔽"),
    Pair("bG", "𝔾"),
    Pair("bH", "ℍ"),
    Pair("bI", "𝕀"),
    Pair("bJ", "𝕁"),
    Pair("bK", "𝕂"),
    Pair("bL", "𝕃"),
    Pair("bM", "𝕄"),
    Pair("bN", "ℕ"),
    Pair("bO", "𝕆"),
    Pair("bP", "ℙ"),
    Pair("bQ", "ℚ"),
    Pair("bR", "ℝ"),
    Pair("bS", "𝕊"),
    Pair("bT", "𝕋"),
    Pair("bU", "𝕌"),
    Pair("bV", "𝕍"),
    Pair("bW", "𝕎"),
    Pair("bX", "𝕏"),
    Pair("bY", "𝕐"),
    Pair("bZ", "ℤ"),
    Pair("bGG", "ℾ"),
    Pair("bGP", "ℿ"),
    Pair("bGS", "⅀"),
    Pair("ba", "𝕒"),
    Pair("bb", "𝕓"),
    Pair("bc", "𝕔"),
    Pair("bd", "𝕕"),
    Pair("be", "𝕖"),
    Pair("bf", "𝕗"),
    Pair("bg", "𝕘"),
    Pair("bh", "𝕙"),
    Pair("bi", "𝕚"),
    Pair("bj", "𝕛"),
    Pair("bk", "𝕜"),
    Pair("bl", "𝕝"),
    Pair("bm", "𝕞"),
    Pair("bn", "𝕟"),
    Pair("bo", "𝕠"),
    Pair("bp", "𝕡"),
    Pair("bq", "𝕢"),
    Pair("br", "𝕣"),
    Pair("bs", "𝕤"),
    Pair("bt", "𝕥"),
    Pair("bu", "𝕦"),
    Pair("bv", "𝕧"),
    Pair("bw", "𝕨"),
    Pair("bx", "𝕩"),
    Pair("by", "𝕪"),
    Pair("bz", "𝕫"),
    Pair("bGg", "ℽ"),
    Pair("bGp", "ℼ"),
    //Blackboard bold numbers.
    Pair("b0", "𝟘"),
    Pair("b1", "𝟙"),
    Pair("b2", "𝟚"),
    Pair("b3", "𝟛"),
    Pair("b4", "𝟜"),
    Pair("b5", "𝟝"),
    Pair("b6", "𝟞"),
    Pair("b7", "𝟟"),
    Pair("b8", "𝟠"),
    Pair("b9", "𝟡"),
    //Mathematical bold letters.
    Pair("BA", "𝐀"),
    Pair("BB", "𝐁"),
    Pair("BC", "𝐂"),
    Pair("BD", "𝐃"),
    Pair("BE", "𝐄"),
    Pair("BF", "𝐅"),
    Pair("BG", "𝐆"),
    Pair("BH", "𝐇"),
    Pair("BI", "𝐈"),
    Pair("BJ", "𝐉"),
    Pair("BK", "𝐊"),
    Pair("BL", "𝐋"),
    Pair("BM", "𝐌"),
    Pair("BN", "𝐍"),
    Pair("BO", "𝐎"),
    Pair("BP", "𝐏"),
    Pair("BQ", "𝐐"),
    Pair("BR", "𝐑"),
    Pair("BS", "𝐒"),
    Pair("BT", "𝐓"),
    Pair("BU", "𝐔"),
    Pair("BV", "𝐕"),
    Pair("BW", "𝐖"),
    Pair("BX", "𝐗"),
    Pair("BY", "𝐘"),
    Pair("BZ", "𝐙"),
    Pair("Ba", "𝐚"),
    Pair("Bb", "𝐛"),
    Pair("Bc", "𝐜"),
    Pair("Bd", "𝐝"),
    Pair("Be", "𝐞"),
    Pair("Bf", "𝐟"),
    Pair("Bg", "𝐠"),
    Pair("Bh", "𝐡"),
    Pair("Bi", "𝐢"),
    Pair("Bj", "𝐣"),
    Pair("Bk", "𝐤"),
    Pair("Bl", "𝐥"),
    Pair("Bm", "𝐦"),
    Pair("Bn", "𝐧"),
    Pair("Bo", "𝐨"),
    Pair("Bp", "𝐩"),
    Pair("Bq", "𝐪"),
    Pair("Br", "𝐫"),
    Pair("Bs", "𝐬"),
    Pair("Bt", "𝐭"),
    Pair("Bu", "𝐮"),
    Pair("Bv", "𝐯"),
    Pair("Bw", "𝐰"),
    Pair("Bx", "𝐱"),
    Pair("By", "𝐲"),
    Pair("Bz", "𝐳"),
    //Mathematical bold Greek letters.
    Pair("BGA", "𝚨"),
    Pair("BGB", "𝚩"),
    Pair("BGC", "𝚾"),
    Pair("BGD", "𝚫"),
    Pair("BGE", "𝚬"),
    Pair("BGG", "𝚪"),
    Pair("BGH", "𝚮"),
    Pair("BGI", "𝚰"),
    Pair("BGK", "𝚱"),
    Pair("BGL", "𝚲"),
    Pair("BGM", "𝚳"),
    Pair("BGN", "𝚴"),
    Pair("BGO", "𝛀"),
    Pair("BOmicron", "𝚶"),
    Pair("BGF", "𝚽"),
    Pair("BPi", "𝚷"),
    Pair("BGP", "𝚿"),
    Pair("BGR", "𝚸"),
    Pair("BGS", "𝚺"),
    Pair("BGT", "𝚻"),
    Pair("BGTH", "𝚯"),
    Pair("BGU", "𝚼"),
    Pair("BGX", "𝚵"),
    Pair("BGZ", "𝚭"),
    Pair("BGa", "𝛂"),
    Pair("BGb", "𝛃"),
    Pair("BGc", "𝛘"),
    Pair("BGd", "𝛅"),
    Pair("BGe", "𝛆"),
    Pair("BGg", "𝛄"),
    Pair("BGh", "𝛈"),
    Pair("BGi", "𝛊"),
    Pair("BGk", "𝛋"),
    Pair("BGl", "𝛌"),
    Pair("BGm", "𝛍"),
    Pair("BGn", "𝛎"),
    Pair("BGo", "𝛚"),
    Pair("Bomicron", "𝛐"),
    Pair("BGf", "𝛗"),
    Pair("Bpi", "𝛑"),
    Pair("BGp", "𝛙"),
    Pair("BGr", "𝛒"),
    Pair("BGs", "𝛔"),
    Pair("BGt", "𝛕"),
    Pair("BGth", "𝛉"),
    Pair("BGu", "𝛖"),
    Pair("BGx", "𝛏"),
    Pair("BGz", "𝛇"),
    //Mathematical bold digits.
    Pair("B0", "𝟎"),
    Pair("B1", "𝟏"),
    Pair("B2", "𝟐"),
    Pair("B3", "𝟑"),
    Pair("B4", "𝟒"),
    Pair("B5", "𝟓"),
    Pair("B6", "𝟔"),
    Pair("B7", "𝟕"),
    Pair("B8", "𝟖"),
    Pair("B9", "𝟗"),
    //Full width letters.
    Pair("FA", "Ａ"),
    Pair("FB", "Ｂ"),
    Pair("FC", "Ｃ"),
    Pair("FD", "Ｄ"),
    Pair("FE", "Ｅ"),
    Pair("FF", "Ｆ"),
    Pair("FG", "Ｇ"),
    Pair("FH", "Ｈ"),
    Pair("FI", "Ｉ"),
    Pair("FJ", "Ｊ"),
    Pair("FK", "Ｋ"),
    Pair("FL", "Ｌ"),
    Pair("FM", "Ｍ"),
    Pair("FN", "Ｎ"),
    Pair("FO", "Ｏ"),
    Pair("FP", "Ｐ"),
    Pair("FQ", "Ｑ"),
    Pair("FR", "Ｒ"),
    Pair("FS", "Ｓ"),
    Pair("FT", "Ｔ"),
    Pair("FU", "Ｕ"),
    Pair("FV", "Ｖ"),
    Pair("FW", "Ｗ"),
    Pair("FX", "Ｘ"),
    Pair("FY", "Ｙ"),
    Pair("FZ", "Ｚ"),
    Pair("Fa", "ａ"),
    Pair("Fb", "ｂ"),
    Pair("Fc", "ｃ"),
    Pair("Fd", "ｄ"),
    Pair("Fe", "ｅ"),
    Pair("Ff", "ｆ"),
    Pair("Fg", "ｇ"),
    Pair("Fh", "ｈ"),
    Pair("Fi", "ｉ"),
    Pair("Fj", "ｊ"),
    Pair("Fk", "ｋ"),
    Pair("Fl", "ｌ"),
    Pair("Fm", "ｍ"),
    Pair("Fn", "ｎ"),
    Pair("Fo", "ｏ"),
    Pair("Fp", "ｐ"),
    Pair("Fq", "ｑ"),
    Pair("Fr", "ｒ"),
    Pair("Fs", "ｓ"),
    Pair("Ft", "ｔ"),
    Pair("Fu", "ｕ"),
    Pair("Fv", "ｖ"),
    Pair("Fw", "ｗ"),
    Pair("Fx", "ｘ"),
    Pair("Fy", "ｙ"),
    Pair("Fz", "ｚ"),
    //Full width digits.
    Pair("F0", "０"),
    Pair("F1", "１"),
    Pair("F2", "２"),
    Pair("F3", "３"),
    Pair("F4", "４"),
    Pair("F5", "５"),
    Pair("F6", "６"),
    Pair("F7", "７"),
    Pair("F8", "８"),
    Pair("F9", "９"),
    //Full width symbols.
    Pair("F!", "！"),
    Pair("F#", "＃"),
    Pair("F$", "＄"),
    Pair("F%", "％"),
    Pair("F&", "＆"),
    Pair("F'", "＇"),
    Pair("F(", "（"),
    Pair("F)", "）"),
    Pair("F*", "＊"),
    Pair("F+", "＋"),
    Pair("F,", "，"),
    Pair("F-", "－"),
    Pair("F.", "．"),
    Pair("F/", "／"),
    Pair("F:", "："),
    Pair("F;", "；"),
    Pair("F<", "＜"),
    Pair("F=", "＝"),
    Pair("F>", "＞"),
    Pair("F?", "？"),
    Pair("F@", "＠"),
    Pair("F[", "［"),
    Pair("F\\", "＼"),
    Pair("F]", "］"),
    Pair("F_", "＿"),
    Pair("F{", "｛"),
    Pair("F|", "｜"),
    Pair("F}", "｝"),
    Pair("F~", "～"),
    Pair("F((", "｟"),
    Pair("F)", "｠"),
    Pair("Fneg", "￢"),
    //Parentheses.
    Pair("(", "([{⁅⁽₍〈⎴⟅⟦⟨⟪⦃〈《「『【〔〖〚︵︷︹︻︽︿﹁﹃﹙﹛﹝（［｛｢❪❬❰❲❴⟮⦅⦗⧼⸨❮⦇⦉"),
    Pair(")", ")]}⁆⁾₎〉⎵⟆⟧⟩⟫⦄〉》」』】〕〗〛︶︸︺︼︾﹀﹂﹄﹚﹜﹞）］｝｣❫❭❱❳❵⟯⦆⦘⧽⸩❯⦈⦊"),
    Pair("[[", "⟦"),
    Pair("]]", "⟧"),
    Pair("<", "⟨<≪⋘≺⊂⋐⊏⊰⊲⋖＜"),
    Pair(">", "⟩>≫⋙≻⊃⋑⊐⊱⊳⋗＞"),
    Pair("<<", "⟪"),
    Pair(">>", "⟫"),
    Pair("{{", "⦃"),
    Pair("}}", "⦄"),
    Pair("(b", "⟅"),
    Pair(")b", "⟆"),
    Pair("lbag", "⟅"),
    Pair("rbag", "⟆"),
    Pair("<|", "⦉"),
    Pair("|>", "⦊"),
    Pair("(|", "⦇"),
    Pair("|)", "⦈"),
    Pair("((", "⦅｟"),
    Pair(")", "⦆｠"),
    //Primes.
    Pair("'", "′″‴⁗＇"),
    Pair("`", "‵‶‷｀"),
    //Fractions.
    Pair("frac", "¼½¾⅓⅔⅕⅖⅗⅘⅙⅚⅛⅜⅝⅞⅟"),
    //Bullets.
    Pair("bu", "•◦‣⁌⁍"),
    Pair("bub", "•"),
    Pair("buw", "◦"),
    Pair("but", "‣"),
    //Musical symbols.
    Pair("note", "♩♪♫♬"),
    Pair("b", "♭"),
    Pair("#", "♯"),
    Pair("bb", "𝄫"),
    Pair("##", "𝄪"),
    //Other punctuation and symbols.
    Pair("\\", "\\"),
    Pair("en", "–"),
    Pair("em", "—"),
    Pair("!", "！"),
    Pair("!!", "‼"),
    Pair("?", "？"),
    Pair("??", "⁇"),
    Pair("!?", "⁉"),
    Pair("die", "⚀⚁⚂⚃⚄⚅"),
    Pair("asterisk", "⁎⁑⁂✢✣✤✥✱✲✳✺✻✼✽❃❉❊❋＊"),
    Pair("tie", "⁀"),
    Pair("undertie", "‿"),
    Pair("apl", "⌶⌷⌸⌹⌺⌻⌼⌽⌾⌿⍀⍁⍂⍃⍄⍅⍆⍇⍈⍉⍊⍋⍌⍍⍎⍏⍐⍑⍒⍓⍔⍕⍖⍗⍘⍙⍚⍛⍜⍝⍞⍟⍠⍡⍢⍣⍤⍥⍦⍧⍨⍩⍪⍫⍬⍭⍮⍯⍰⍱⍲⍳⍴⍵⍶⍷⍸⍹⍺⎕"),
    Pair("#", "＃"),
    Pair("%", "％"),
    Pair("&", "＆"),
    Pair("*", "＊"),
    Pair("/", "／＼"),
    Pair("@", "＠"),
    Pair("__", "＿"),
    Pair("crossmark", "✗"),
    //Some combining characters.
    Pair("^--", "̅̿"),
    Pair("_--", "̲̳"),
    Pair("^~", "̃͌"),
    Pair("^.", "̇̈⃛⃜"),
    Pair("_.", "̣̤"),
    Pair("^l", "⃖⃐⃔"),
    Pair("^r", "⃗⃑⃕"),
    Pair("^^", "̂̑͆"),
    Pair("_^", "̭̯̪"),
    Pair("^v", "̌̆"),
    Pair("_v", "̬̮̺"),
    //Shorter forms of many greek letters plus ƛ.
    Pair("Ga", "α"),
    Pair("GA", "Α"),
    Pair("Gb", "β"),
    Pair("GB", "Β"),
    Pair("Gg", "γ"),
    Pair("GG", "Γ"),
    Pair("Gd", "δ"),
    Pair("GD", "Δ"),
    Pair("Ge", "ε"),
    Pair("GE", "Ε"),
    Pair("Gz", "ζ"),
    Pair("GZ", "Ζ"),
    Pair("Gh", "η"),
    Pair("GH", "Η"),
    Pair("Gth", "θ"),
    Pair("GTH", "Θ"),
    Pair("Gi", "ι"),
    Pair("GI", "Ι"),
    Pair("Gk", "κ"),
    Pair("GK", "Κ"),
    Pair("Gl", "λ"),
    Pair("GL", "Λ"),
    Pair("Gl-", "ƛ"),
    Pair("Gm", "μ"),
    Pair("GM", "Μ"),
    Pair("Gn", "ν"),
    Pair("GN", "Ν"),
    Pair("Gx", "ξ"),
    Pair("GX", "Ξ"),
    Pair("Gr", "ρ"),
    Pair("GR", "Ρ"),
    Pair("Gs", "σ"),
    Pair("GS", "Σ"),
    Pair("Gt", "τ"),
    Pair("GT", "Τ"),
    Pair("Gu", "υ"),
    Pair("GU", "Υ"),
    Pair("Gf", "φ"),
    Pair("GF", "Φ"),
    Pair("Gc", "χ"),
    Pair("GC", "Χ"),
    Pair("Gp", "ψ"),
    Pair("GP", "Ψ"),
    Pair("Go", "ω"),
    Pair("GO", "Ω"),
    Pair("MiA", "𝐴"),
    Pair("MiB", "𝐵"),
    Pair("MiC", "𝐶"),
    Pair("MiD", "𝐷"),
    Pair("MiE", "𝐸"),
    Pair("MiF", "𝐹"),
    Pair("MiG", "𝐺"),
    Pair("MiH", "𝐻"),
    Pair("MiI", "𝐼"),
    Pair("MiJ", "𝐽"),
    Pair("MiK", "𝐾"),
    Pair("MiL", "𝐿"),
    Pair("MiM", "𝑀"),
    Pair("MiN", "𝑁"),
    Pair("MiO", "𝑂"),
    Pair("MiP", "𝑃"),
    Pair("MiQ", "𝑄"),
    Pair("MiR", "𝑅"),
    Pair("MiS", "𝑆"),
    Pair("MiT", "𝑇"),
    Pair("MiU", "𝑈"),
    Pair("MiV", "𝑉"),
    Pair("MiW", "𝑊"),
    Pair("MiX", "𝑋"),
    Pair("MiY", "𝑌"),
    Pair("MiZ", "𝑍"),
    Pair("Mia", "𝑎"),
    Pair("Mib", "𝑏"),
    Pair("Mic", "𝑐"),
    Pair("Mid", "𝑑"),
    Pair("Mie", "𝑒"),
    Pair("Mif", "𝑓"),
    Pair("Mig", "𝑔"),
    Pair("Mih", "ℎ"),
    Pair("Mii", "𝑖"),
    Pair("Mij", "𝑗"),
    Pair("Mik", "𝑘"),
    Pair("Mil", "𝑙"),
    Pair("Mim", "𝑚"),
    Pair("Min", "𝑛"),
    Pair("Mio", "𝑜"),
    Pair("Mip", "𝑝"),
    Pair("Miq", "𝑞"),
    Pair("Mir", "𝑟"),
    Pair("Mis", "𝑠"),
    Pair("Mit", "𝑡"),
    Pair("Miu", "𝑢"),
    Pair("Miv", "𝑣"),
    Pair("Miw", "𝑤"),
    Pair("Mix", "𝑥"),
    Pair("Miy", "𝑦"),
    Pair("Miz", "𝑧"),
    Pair("MIA", "𝑨"),
    Pair("MIB", "𝑩"),
    Pair("MIC", "𝑪"),
    Pair("MID", "𝑫"),
    Pair("MIE", "𝑬"),
    Pair("MIF", "𝑭"),
    Pair("MIG", "𝑮"),
    Pair("MIH", "𝑯"),
    Pair("MII", "𝑰"),
    Pair("MIJ", "𝑱"),
    Pair("MIK", "𝑲"),
    Pair("MIL", "𝑳"),
    Pair("MIM", "𝑴"),
    Pair("MIN", "𝑵"),
    Pair("MIO", "𝑶"),
    Pair("MIP", "𝑷"),
    Pair("MIQ", "𝑸"),
    Pair("MIR", "𝑹"),
    Pair("MIS", "𝑺"),
    Pair("MIT", "𝑻"),
    Pair("MIU", "𝑼"),
    Pair("MIV", "𝑽"),
    Pair("MIW", "𝑾"),
    Pair("MIX", "𝑿"),
    Pair("MIY", "𝒀"),
    Pair("MIZ", "𝒁"),
    Pair("MIa", "𝒂"),
    Pair("MIb", "𝒃"),
    Pair("MIc", "𝒄"),
    Pair("MId", "𝒅"),
    Pair("MIe", "𝒆"),
    Pair("MIf", "𝒇"),
    Pair("MIg", "𝒈"),
    Pair("MIh", "𝒉"),
    Pair("MIi", "𝒊"),
    Pair("MIj", "𝒋"),
    Pair("MIk", "𝒌"),
    Pair("MIl", "𝒍"),
    Pair("MIm", "𝒎"),
    Pair("MIn", "𝒏"),
    Pair("MIo", "𝒐"),
    Pair("MIp", "𝒑"),
    Pair("MIq", "𝒒"),
    Pair("MIr", "𝒓"),
    Pair("MIs", "𝒔"),
    Pair("MIt", "𝒕"),
    Pair("MIu", "𝒖"),
    Pair("MIv", "𝒗"),
    Pair("MIw", "𝒘"),
    Pair("MIx", "𝒙"),
    Pair("MIy", "𝒚"),
    Pair("MIz", "𝒛"),
    Pair("McA", "𝒜"),
    Pair("McB", "ℬ"),
    Pair("McC", "𝒞"),
    Pair("McD", "𝒟"),
    Pair("McE", "ℰ"),
    Pair("McF", "ℱ"),
    Pair("McG", "𝒢"),
    Pair("McH", "ℋ"),
    Pair("McI", "ℐ"),
    Pair("McJ", "𝒥"),
    Pair("McK", "𝒦"),
    Pair("McL", "ℒ"),
    Pair("McM", "ℳ"),
    Pair("McN", "𝒩"),
    Pair("McO", "𝒪"),
    Pair("McP", "𝒫"),
    Pair("McQ", "𝒬"),
    Pair("McR", "ℛ"),
    Pair("McS", "𝒮"),
    Pair("McT", "𝒯"),
    Pair("McU", "𝒰"),
    Pair("McV", "𝒱"),
    Pair("McW", "𝒲"),
    Pair("McX", "𝒳"),
    Pair("McY", "𝒴"),
    Pair("McZ", "𝒵"),
    Pair("Mca", "𝒶"),
    Pair("Mcb", "𝒷"),
    Pair("Mcc", "𝒸"),
    Pair("Mcd", "𝒹"),
    Pair("Mce", "ℯ"),
    Pair("Mcf", "𝒻"),
    Pair("Mcg", "ℊ"),
    Pair("Mch", "𝒽"),
    Pair("Mci", "𝒾"),
    Pair("Mcj", "𝒿"),
    Pair("Mck", "𝓀"),
    Pair("Mcl", "𝓁"),
    Pair("Mcm", "𝓂"),
    Pair("Mcn", "𝓃"),
    Pair("Mco", "ℴ"),
    Pair("Mcp", "𝓅"),
    Pair("Mcq", "𝓆"),
    Pair("Mcr", "𝓇"),
    Pair("Mcs", "𝓈"),
    Pair("Mct", "𝓉"),
    Pair("Mcu", "𝓊"),
    Pair("Mcv", "𝓋"),
    Pair("Mcw", "𝓌"),
    Pair("Mcx", "𝓍"),
    Pair("Mcy", "𝓎"),
    Pair("Mcz", "𝓏"),
    Pair("MCA", "𝓐"),
    Pair("MCB", "𝓑"),
    Pair("MCC", "𝓒"),
    Pair("MCD", "𝓓"),
    Pair("MCE", "𝓔"),
    Pair("MCF", "𝓕"),
    Pair("MCG", "𝓖"),
    Pair("MCH", "𝓗"),
    Pair("MCI", "𝓘"),
    Pair("MCJ", "𝓙"),
    Pair("MCK", "𝓚"),
    Pair("MCL", "𝓛"),
    Pair("MCM", "𝓜"),
    Pair("MCN", "𝓝"),
    Pair("MCO", "𝓞"),
    Pair("MCP", "𝓟"),
    Pair("MCQ", "𝓠"),
    Pair("MCR", "𝓡"),
    Pair("MCS", "𝓢"),
    Pair("MCT", "𝓣"),
    Pair("MCU", "𝓤"),
    Pair("MCV", "𝓥"),
    Pair("MCW", "𝓦"),
    Pair("MCX", "𝓧"),
    Pair("MCY", "𝓨"),
    Pair("MCZ", "𝓩"),
    Pair("MCa", "𝓪"),
    Pair("MCb", "𝓫"),
    Pair("MCc", "𝓬"),
    Pair("MCd", "𝓭"),
    Pair("MCe", "𝓮"),
    Pair("MCf", "𝓯"),
    Pair("MCg", "𝓰"),
    Pair("MCh", "𝓱"),
    Pair("MCi", "𝓲"),
    Pair("MCj", "𝓳"),
    Pair("MCk", "𝓴"),
    Pair("MCl", "𝓵"),
    Pair("MCm", "𝓶"),
    Pair("MCn", "𝓷"),
    Pair("MCo", "𝓸"),
    Pair("MCp", "𝓹"),
    Pair("MCq", "𝓺"),
    Pair("MCr", "𝓻"),
    Pair("MCs", "𝓼"),
    Pair("MCt", "𝓽"),
    Pair("MCu", "𝓾"),
    Pair("MCv", "𝓿"),
    Pair("MCw", "𝔀"),
    Pair("MCx", "𝔁"),
    Pair("MCy", "𝔂"),
    Pair("MCz", "𝔃"),
    Pair("MfA", "𝔄"),
    Pair("MfB", "𝔅"),
    Pair("MfC", "ℭ"),
    Pair("MfD", "𝔇"),
    Pair("MfE", "𝔈"),
    Pair("MfF", "𝔉"),
    Pair("MfG", "𝔊"),
    Pair("MfH", "ℌ"),
    Pair("MfI", "ℑ"),
    Pair("MfJ", "𝔍"),
    Pair("MfK", "𝔎"),
    Pair("MfL", "𝔏"),
    Pair("MfM", "𝔐"),
    Pair("MfN", "𝔑"),
    Pair("MfO", "𝔒"),
    Pair("MfP", "𝔓"),
    Pair("MfQ", "𝔔"),
    Pair("MfR", "ℜ"),
    Pair("MfS", "𝔖"),
    Pair("MfT", "𝔗"),
    Pair("MfU", "𝔘"),
    Pair("MfV", "𝔙"),
    Pair("MfW", "𝔚"),
    Pair("MfX", "𝔛"),
    Pair("MfY", "𝔜"),
    Pair("MfZ", "ℨ"),
    Pair("Mfa", "𝔞"),
    Pair("Mfb", "𝔟"),
    Pair("Mfc", "𝔠"),
    Pair("Mfd", "𝔡"),
    Pair("Mfe", "𝔢"),
    Pair("Mff", "𝔣"),
    Pair("Mfg", "𝔤"),
    Pair("Mfh", "𝔥"),
    Pair("Mfi", "𝔦"),
    Pair("Mfj", "𝔧"),
    Pair("Mfk", "𝔨"),
    Pair("Mfl", "𝔩"),
    Pair("Mfm", "𝔪"),
    Pair("Mfn", "𝔫"),
    Pair("Mfo", "𝔬"),
    Pair("Mfp", "𝔭"),
    Pair("Mfq", "𝔮"),
    Pair("Mfr", "𝔯"),
    Pair("Mfs", "𝔰"),
    Pair("Mft", "𝔱"),
    Pair("Mfu", "𝔲"),
    Pair("Mfv", "𝔳"),
    Pair("Mfw", "𝔴"),
    Pair("Mfx", "𝔵"),
    Pair("Mfy", "𝔶"),
    Pair("Mfz", "𝔷"),
    // Sub/Super-scripts.
    Pair("_a", "ₐ"),
    Pair("_b", "b"),
    Pair("_c", "c"),
    Pair("_d", "d"),
    Pair("_e", "ₑ"),
    Pair("_f", "f"),
    Pair("_g", "g"),
    Pair("_h", "ₕ"),
    Pair("_i", "ᵢ"),
    Pair("_j", "ⱼ"),
    Pair("_k", "ₖ"),
    Pair("_l", "ₗ"),
    Pair("_m", "ₘ"),
    Pair("_n", "ₙ"),
    Pair("_o", "ₒ"),
    Pair("_p", "ₚ"),
    Pair("_q", "q"),
    Pair("_r", "ᵣ"),
    Pair("_s", "ₛ"),
    Pair("_t", "ₜ"),
    Pair("_u", "ᵤ"),
    Pair("_v", "ᵥ"),
    Pair("_w", "w"),
    Pair("_x", "ₓ"),
    Pair("_y", "y"),
    Pair("_z", "z"),
    Pair("_Gb", "ᵦ"),
    Pair("_Gg", "ᵧ"),
    Pair("_Gr", "ᵨ"),
    Pair("_Gf", "ᵩ"),
    Pair("_Gc", "ᵪ"),
    Pair("^a", "ᵃ"),
    Pair("^b", "ᵇ"),
    Pair("^c", "ᶜ"),
    Pair("^d", "ᵈ"),
    Pair("^e", "ᵉ"),
    Pair("^f", "ᶠ"),
    Pair("^g", "ᵍ"),
    Pair("^h", "ʰ"),
    Pair("^i", "ⁱ"),
    Pair("^j", "ʲ"),
    Pair("^k", "ᵏ"),
    Pair("^l", "ˡ"),
    Pair("^m", "ᵐ"),
    Pair("^n", "ⁿ"),
    Pair("^o", "ᵒ"),
    Pair("^p", "ᵖ"),
    Pair("^q", "q"),
    Pair("^r", "ʳ"),
    Pair("^s", "ˢ"),
    Pair("^t", "ᵗ"),
    Pair("^u", "ᵘ"),
    Pair("^v", "ᵛ"),
    Pair("^w", "ʷ"),
    Pair("^x", "ˣ"),
    Pair("^y", "ʸ"),
    Pair("^z", "ᶻ"),
    Pair("^A", "ᴬ"),
    Pair("^B", "ᴮ"),
    Pair("^C", "C"),
    Pair("^D", "ᴰ"),
    Pair("^E", "ᴱ"),
    Pair("^F", "F"),
    Pair("^G", "ᴳ"),
    Pair("^H", "ᴴ"),
    Pair("^I", "ᴵ"),
    Pair("^J", "ᴶ"),
    Pair("^K", "ᴷ"),
    Pair("^L", "ᴸ"),
    Pair("^M", "ᴹ"),
    Pair("^N", "ᴺ"),
    Pair("^O", "ᴼ"),
    Pair("^P", "ᴾ"),
    Pair("^Q", "Q"),
    Pair("^R", "ᴿ"),
    Pair("^S", "S"),
    Pair("^T", "ᵀ"),
    Pair("^U", "ᵁ"),
    Pair("^V", "ⱽ"),
    Pair("^W", "ᵂ"),
    Pair("^X", "X"),
    Pair("^Y", "Y"),
    Pair("^Z", "Z"),
    Pair("^Ga", "ᵅ"),
    Pair("^Gb", "ᵝ"),
    Pair("^Gg", "ᵞ"),
    Pair("^Gd", "ᵟ"),
    Pair("^Ge", "ᵋ"),
    Pair("^Gth", "ᶿ"),
    Pair("^Gi", "ᶥ"),
    Pair("^Gf", "ᵠ"),
    Pair("^Gc", "ᵡ"),
    Pair("^GF", "ᶲ"),
    //Some ISO8859-1 characters.
    Pair("", " "),
    Pair("!", "¡"),
    Pair("cent", "¢"),
    Pair("brokenbar", "¦"),
    Pair("degree", "°"),
    Pair("?", "¿"),
    Pair("^a_", "ª"),
    Pair("^o_", "º"),
    //Circled, parenthesised etc. numbers and letters.
    Pair("(0)", "⓪🄀⓿🄋🄌"),
    Pair("(1)", "⑴①⒈❶➀➊"),
    Pair("(2)", "⑵②⒉❷➁➋"),
    Pair("(3)", "⑶③⒊❸➂➌"),
    Pair("(4)", "⑷④⒋❹➃➍"),
    Pair("(5)", "⑸⑤⒌❺➄➎"),
    Pair("(6)", "⑹⑥⒍❻➅➏"),
    Pair("(7)", "⑺⑦⒎❼➆➐"),
    Pair("(8)", "⑻⑧⒏❽➇➑"),
    Pair("(9)", "⑼⑨⒐❾➈➒"),
    Pair("(10)", "⑽⑩⒑❿➉➓"),
    Pair("(11)", "⑾⑪⒒⓫"),
    Pair("(12)", "⑿⑫⒓⓬"),
    Pair("(13)", "⒀⑬⒔⓭"),
    Pair("(14)", "⒁⑭⒕⓮"),
    Pair("(15)", "⒂⑮⒖⓯"),
    Pair("(16)", "⒃⑯⒗⓰"),
    Pair("(17)", "⒄⑰⒘⓱"),
    Pair("(18)", "⒅⑱⒙⓲"),
    Pair("(19)", "⒆⑲⒚⓳"),
    Pair("(20)", "⒇⑳⒛⓴"),
    Pair("(a)", "⒜Ⓐⓐ🅐🄰🅰"),
    Pair("(b)", "⒝Ⓑⓑ🅑🄱🅱"),
    Pair("(c)", "⒞Ⓒⓒ🅒🄲🅲"),
    Pair("(d)", "⒟Ⓓⓓ🅓🄳🅳"),
    Pair("(e)", "⒠Ⓔⓔ🅔🄴🅴"),
    Pair("(f)", "⒡Ⓕⓕ🅕🄵🅵"),
    Pair("(g)", "⒢Ⓖⓖ🅖🄶🅶"),
    Pair("(h)", "⒣Ⓗⓗ🅗🄷🅷"),
    Pair("(i)", "⒤Ⓘⓘ🅘🄸🅸"),
    Pair("(j)", "⒥Ⓙⓙ🅙🄹🅹"),
    Pair("(k)", "⒦Ⓚⓚ🅚🄺🅺"),
    Pair("(l)", "⒧Ⓛⓛ🅛🄻🅻"),
    Pair("(m)", "⒨Ⓜⓜ🅜🄼🅼"),
    Pair("(n)", "⒩Ⓝⓝ🅝🄽🅽"),
    Pair("(o)", "⒪Ⓞⓞ🅞🄾🅾"),
    Pair("(p)", "⒫Ⓟⓟ🅟🄿🅿"),
    Pair("(q)", "⒬Ⓠⓠ🅠🅀🆀"),
    Pair("(r)", "⒭Ⓡⓡ🅡🅁🆁"),
    Pair("(s)", "⒮Ⓢⓢ🅢🅂🆂"),
    Pair("(t)", "⒯Ⓣⓣ🅣🅃🆃"),
    Pair("(u)", "⒰Ⓤⓤ🅤🅄🆄"),
    Pair("(v)", "⒱Ⓥⓥ🅥🅅🆅"),
    Pair("(w)", "⒲Ⓦⓦ🅦🅆🆆"),
    Pair("(x)", "⒳Ⓧⓧ🅧🅇🆇"),
    Pair("(y)", "⒴Ⓨⓨ🅨🅈🆈"),
    Pair("(z)", "⒵Ⓩⓩ🅩🅉🆉")
)
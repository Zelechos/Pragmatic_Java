/*
 * @Autor: Pragmatic Coder
 * @Repositorio : https://github.com/Zelechos/Pragmatic_Java
*/
package write_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {

    
    
    String TextMd = "### Features\n" +
"\n" +
"- Support Standard Markdown / CommonMark and GFM(GitHub Flavored Markdown);\n" +
"- Full-featured: Real-time Preview, Image (cross-domain) upload, Preformatted text/Code blocks/Tables insert, Code fold, Search replace, Read only, Themes, Multi-languages, L18n, HTML entities, Code syntax highlighting...;\n" +
"- Markdown Extras : Support ToC (Table of Contents), Emoji, Task lists, @Links...;\n" +
"- Compatible with all major browsers (IE8+), compatible Zepto.js and iPad;\n" +
"- Support identification, interpretation, fliter of the HTML tags;\n" +
"- Support TeX (LaTeX expressions, Based on KaTeX), Flowchart and Sequence Diagram of Markdown extended syntax;\n" +
"- Support AMD/CMD (Require.js & Sea.js) Module Loader, and Custom/define editor plugins;\n" +
"\n" +
"# Editor.md\n" +
"\n" +
"![](https://pandao.github.io/editor.md/images/logos/editormd-logo-180x180.png)\n" +
"\n" +
"![](https://img.shields.io/github/stars/pandao/editor.md.svg) ![](https://img.shields.io/github/forks/pandao/editor.md.svg) ![](https://img.shields.io/github/tag/pandao/editor.md.svg) ![](https://img.shields.io/github/release/pandao/editor.md.svg) ![](https://img.shields.io/github/issues/pandao/editor.md.svg) ![](https://img.shields.io/bower/v/editor.md.svg)\n" +
"\n" +
"\n" +
"**Table of Contents**\n" +
"\n" +
"[TOCM]\n" +
"\n" +
"[TOC]\n" +
"\n" +
"#H1 header\n" +
"##H2 header\n" +
"###H3 header\n" +
"####H4 header\n" +
"#####H5 header\n" +
"######H6 header\n" +
"#Heading 1 link [Heading link](https://github.com/Zelechos/Pragmatic_Java\"Heading link\")\n" +
"##Heading 2 link [Heading link](https://github.com/Zelechos/Pragmatic_Java \"Heading link\")\n" +
"###Heading 3 link [Heading link](https://github.com/Zelechos/Pragmatic_Java\"Heading link\")\n" +
"####Heading 4 link [Heading link](https://github.com/Zelechos/Pragmatic_Java\"Heading link\") Heading link [Heading link](https://github.com/Zelechos/Pragmatic_Java \"Heading link\")\n" +
"#####Heading 5 link [Heading link](https://github.com/Zelechos/Pragmatic_Java \"Heading link\")\n" +
"######Heading 6 link [Heading link](https://github.com/Zelechos/Pragmatic_Java \"Heading link\")\n" +
"\n" +
"##Headers (Underline)\n" +
"\n" +
"H1 Header (Underline)\n" +
"=============\n" +
"\n" +
"H2 Header (Underline)\n" +
"-------------\n" +
"\n" +
"###Characters\n" +
"                \n" +
"----\n" +
"\n" +
"~~Strikethrough~~ <s>Strikethrough (when enable html tag decode.)</s>\n" +
"*Italic*      _Italic_\n" +
"**Emphasis**  __Emphasis__\n" +
"***Emphasis Italic*** ___Emphasis Italic___\n" +
"\n" +
"Superscript: X<sub>2</sub>，Subscript: O<sup>2</sup>\n" +
"\n" +
"**Abbreviation(link HTML abbr tag)**\n" +
"\n" +
"The <abbr title=\"Hyper Text Markup Language\">HTML</abbr> specification is maintained by the <abbr title=\"World Wide Web Consortium\">W3C</abbr>.\n" +
"\n" +
"###Blockquotes\n" +
"\n" +
"> Blockquotes\n" +
"\n" +
"Paragraphs and Line Breaks\n" +
"                    \n" +
"> \"Blockquotes Blockquotes\", [Link](http://localhost/)。\n" +
"\n" +
"###Links\n" +
"\n" +
"[Links](http://localhost/)\n" +
"\n" +
"[Links with title](http://localhost/ \"link title\")\n" +
"\n" +
"`<link>` : <https://github.com>\n" +
"\n" +
"[Reference link][id/name] \n" +
"\n" +
"[id/name]: http://link-url/\n" +
"\n" +
"GFM a-tail link @pandao\n" +
"\n" +
"###Code Blocks (multi-language) & highlighting\n" +
"\n" +
"####Inline code\n" +
"\n" +
"`$ npm install marked`\n" +
"\n" +
"####Code Blocks (Indented style)\n" +
"\n" +
"Indented 4 spaces, like `<pre>` (Preformatted Text).\n" +
"\n" +
"    <?php\n" +
"        echo \"Hello world!\";\n" +
"    ?>\n" +
"    \n" +
"Code Blocks (Preformatted text):\n" +
"\n" +
"    | First Header  | Second Header |\n" +
"    | ------------- | ------------- |\n" +
"    | Content Cell  | Content Cell  |\n" +
"    | Content Cell  | Content Cell  |\n" +
"\n" +
"####Javascript　\n" +
"\n" +
"```javascript\n" +
"function test(){\n" +
"	console.log(\"Hello world!\");\n" +
"}\n" +
" \n" +
"(function(){\n" +
"    var box = function(){\n" +
"        return box.fn.init();\n" +
"    };\n" +
"\n" +
"    box.prototype = box.fn = {\n" +
"        init : function(){\n" +
"            console.log('box.init()');\n" +
"\n" +
"			return this;\n" +
"        },\n" +
"\n" +
"		add : function(str){\n" +
"			alert(\"add\", str);\n" +
"\n" +
"			return this;\n" +
"		},\n" +
"\n" +
"		remove : function(str){\n" +
"			alert(\"remove\", str);\n" +
"\n" +
"			return this;\n" +
"		}\n" +
"    };\n" +
"    \n" +
"    box.fn.init.prototype = box.fn;\n" +
"    \n" +
"    window.box =box;\n" +
"})();\n" +
"\n" +
"var testBox = box();\n" +
"testBox.add(\"jQuery\").remove(\"jQuery\");\n" +
"```\n" +
"\n" +
"####HTML code\n" +
"\n" +
"```html\n" +
"<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <mate charest=\"utf-8\" />\n" +
"        <title>Hello world!</title>\n" +
"    </head>\n" +
"    <body>\n" +
"        <h1>Hello world!</h1>\n" +
"    </body>\n" +
"</html>\n" +
"```\n" +
"\n" +
"###Images\n" +
"\n" +
"Image:\n" +
"\n" +
"![](https://pandao.github.io/editor.md/examples/images/4.jpg)\n" +
"\n" +
"> Follow your heart.\n" +
"\n" +
"![](https://pandao.github.io/editor.md/examples/images/8.jpg)\n" +
"\n" +
"> 图为：厦门白城沙滩 Xiamen\n" +
"\n" +
"图片加链接 (Image + Link)：\n" +
"\n" +
"[![](https://pandao.github.io/editor.md/examples/images/7.jpg)](https://pandao.github.io/editor.md/examples/images/7.jpg \"李健首张专辑《似水流年》封面\")\n" +
"\n" +
"> 图为：李健首张专辑《似水流年》封面\n" +
"                \n" +
"----\n" +
"\n" +
"###Lists\n" +
"\n" +
"####Unordered list (-)\n" +
"\n" +
"- Item A\n" +
"- Item B\n" +
"- Item C\n" +
"     \n" +
"####Unordered list (*)\n" +
"\n" +
"* Item A\n" +
"* Item B\n" +
"* Item C\n" +
"\n" +
"####Unordered list (plus sign and nested)\n" +
"                \n" +
"+ Item A\n" +
"+ Item B\n" +
"    + Item B 1\n" +
"    + Item B 2\n" +
"    + Item B 3\n" +
"+ Item C\n" +
"    * Item C 1\n" +
"    * Item C 2\n" +
"    * Item C 3\n" +
"\n" +
"####Ordered list\n" +
"                \n" +
"1. Item A\n" +
"2. Item B\n" +
"3. Item C\n" +
"                \n" +
"----\n" +
"                    \n" +
"###Tables\n" +
"                    \n" +
"First Header  | Second Header\n" +
"------------- | -------------\n" +
"Content Cell  | Content Cell\n" +
"Content Cell  | Content Cell \n" +
"\n" +
"| First Header  | Second Header |\n" +
"| ------------- | ------------- |\n" +
"| Content Cell  | Content Cell  |\n" +
"| Content Cell  | Content Cell  |\n" +
"\n" +
"| Function name | Description                    |\n" +
"| ------------- | ------------------------------ |\n" +
"| `help()`      | Display the help window.       |\n" +
"| `destroy()`   | **Destroy your computer!**     |\n" +
"\n" +
"| Item      | Value |\n" +
"| --------- | -----:|\n" +
"| Computer  | $1600 |\n" +
"| Phone     |   $12 |\n" +
"| Pipe      |    $1 |\n" +
"\n" +
"| Left-Aligned  | Center Aligned  | Right Aligned |\n" +
"| :------------ |:---------------:| -----:|\n" +
"| col 3 is      | some wordy text | $1600 |\n" +
"| col 2 is      | centered        |   $12 |\n" +
"| zebra stripes | are neat        |    $1 |\n" +
"                \n" +
"----\n" +
"\n" +
"####HTML entities\n" +
"\n" +
"&copy; &  &uml; &trade; &iexcl; &pound;\n" +
"&amp; &lt; &gt; &yen; &euro; &reg; &plusmn; &para; &sect; &brvbar; &macr; &laquo; &middot; \n" +
"\n" +
"X&sup2; Y&sup3; &frac34; &frac14;  &times;  &divide;   &raquo;\n" +
"\n" +
"18&ordm;C  &quot;  &apos;\n" +
"\n" +
"##Escaping for Special Characters\n" +
"\n" +
"\\*literal asterisks\\*\n" +
"\n" +
"##Markdown extras\n" +
"\n" +
"###GFM task list\n" +
"\n" +
"- [x] GFM task list 1\n" +
"- [x] GFM task list 2\n" +
"- [ ] GFM task list 3\n" +
"    - [ ] GFM task list 3-1\n" +
"    - [ ] GFM task list 3-2\n" +
"    - [ ] GFM task list 3-3\n" +
"- [ ] GFM task list 4\n" +
"    - [ ] GFM task list 4-1\n" +
"    - [ ] GFM task list 4-2\n" +
"\n" +
"###Emoji mixed :smiley:\n" +
"\n" +
"> Blockquotes :star:\n" +
"\n" +
"####GFM task lists & Emoji & fontAwesome icon emoji & editormd logo emoji :editormd-logo-5x:\n" +
"\n" +
"- [x] :smiley: @mentions, :smiley: #refs, [links](), **formatting**, and <del>tags</del> supported :editormd-logo:;\n" +
"- [x] list syntax required (any unordered or ordered list supported) :editormd-logo-3x:;\n" +
"- [x] [ ] :smiley: this is a complete item :smiley:;\n" +
"- [ ] []this is an incomplete item [test link](#) :fa-star: @pandao; \n" +
"- [ ] [ ]this is an incomplete item :fa-star: :fa-gear:;\n" +
"    - [ ] :smiley: this is an incomplete item [test link](#) :fa-star: :fa-gear:;\n" +
"    - [ ] :smiley: this is  :fa-star: :fa-gear: an incomplete item [test link](#);\n" +
"            \n" +
"###TeX(LaTeX)\n" +
"   \n" +
"$$E=mc^2$$\n" +
"\n" +
"Inline $$E=mc^2$$ Inline，Inline $$E=mc^2$$ Inline。\n" +
"\n" +
"$$\\(\\sqrt{3x-1}+(1+x)^2\\)$$\n" +
"                    \n" +
"$$\\sin(\\alpha)^{\\theta}=\\sum_{i=0}^{n}(x^i + \\cos(f))$$\n" +
"                \n" +
"###FlowChart\n" +
"\n" +
"```flow\n" +
"st=>start: Login\n" +
"op=>operation: Login operation\n" +
"cond=>condition: Successful Yes or No?\n" +
"e=>end: To admin\n" +
"\n" +
"st->op->cond\n" +
"cond(yes)->e\n" +
"cond(no)->op\n" +
"```\n" +
"\n" +
"###Sequence Diagram\n" +
"                    \n" +
"```seq\n" +
"Andrew->China: Says Hello \n" +
"Note right of China: China thinks\\nabout it \n" +
"China-->Andrew: How are you? \n" +
"Andrew->>China: I am good thanks!\n" +
"```\n" +
"\n" +
"###End";
    
    File README;
    
    
    private void CreateFile(){
        README =  new File("README.md");
        
        try {
            if(README.createNewFile()){
                System.out.println("The File "+README.getName()+ "has been created successfully ...");
            }
        } catch (IOException ex) {
               System.err.println("Error the File was not created :\n"+ex);
        }finally{
                System.out.println("Bye...");
        }
    }
    
    private void WriteFile(){
        try {
            FileWriter writing = new FileWriter(README);
            writing.write(TextMd);
            writing.close();
        } catch (IOException ex) {
            System.err.println("Error could not write to file...\n"+ex);
        }
    }
    
    private void AddText(){
        
        try {
            FileWriter writing = new FileWriter(README,true);
            writing.write("\r\nAuthor: Pragmatic Coder");
            writing.close();
        } catch (IOException ex) {
            System.err.println("Error could not write to file...\n"+ex);
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        Write_File Archivo = new Write_File();
        
        //Creamos un Archivo
        Archivo.CreateFile();
        //Archivo.WriteFile();
        Archivo.AddText();
        
        
    }
    
}

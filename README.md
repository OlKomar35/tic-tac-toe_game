<h1 align="center">Tic-tac-toe Game - игра в крестики-нолики. <br> Реализованная при помощи Java Swing </h1>
<h2 dir="auto"><a id="user-content-оглавление" class="anchor" aria-hidden="true" href="#оглавление"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"></svg></a>Оглавление</h2>
<ol start="0" dir="auto">
<li><a href="#предисловие">Предисловие</a></li>
<li><a href="#%D0%97%D0%B0%D0%B3%D0%BE%D0%BB%D0%BE%D0%B2%D0%BA%D0%B8">Заголовки</a></li>
<li><a href="#%D0%A0%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%D1%81-%D0%B2%D1%8B%D0%B4%D0%B5%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5%D0%BC-%D1%82%D0%B5%D0%BA%D1%81%D1%82%D0%B0">Работа с выделением текста</a></li>
<li><a href="#%D0%98%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%8D%D0%BC%D0%BE%D0%B4%D0%B7%D0%B8-emoji">Использование эмодзи (emoji)</a></li>
<li><a href="#%D0%98%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%86%D0%B8%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D0%B2-%D1%82%D0%B5%D0%BA%D1%81%D1%82%D0%B5">Использование цитирования в тексте</a></li>
<li><a href="#%D0%9F%D0%BE%D0%B4%D1%81%D0%B2%D0%B5%D1%82%D0%BA%D0%B0-%D0%BA%D0%BE%D0%B4%D0%B0">Подсветка кода</a></li>
<li><a href="#%D0%A1%D0%BF%D0%B8%D1%81%D0%BA%D0%B8">Списки</a>
<ol dir="auto">
<li><a href="#%D0%9C%D0%B0%D1%80%D0%BA%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9">Маркированный</a></li>
<li><a href="#%D0%9D%D1%83%D0%BC%D0%B5%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B9">Нумерованный</a></li>
<li><a href="#%D0%A1%D0%BC%D0%B5%D1%88%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D1%81%D0%BF%D0%B8%D1%81%D0%BA%D0%B8">Смешанные списки</a></li>
<li><a href="#%D0%A1%D0%BF%D0%B8%D1%81%D0%BE%D0%BA-%D0%B7%D0%B0%D0%B4%D0%B0%D1%87">Список задач</a></li>
</ol>
</li>
<li><a href="#%D0%A1%D1%81%D1%8B%D0%BB%D0%BA%D0%B8">Ссылки</a></li>
<li><a href="#%D0%92%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0-%D0%B8%D0%B7%D0%BE%D0%B1%D1%80%D0%B0%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F">Вставка изображения</a></li>
<li><a href="#%D0%92%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0-%D1%82%D0%B0%D0%B1%D0%BB%D0%B8%D1%86">Вставка таблиц</a></li>
<li><a href="#%D0%B4%D0%B8%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%BC-mermaidjs">Диаграмм Mermaid.js</a></li>
<li><a href="https://github.com/GnuriaN/format-README/blob/master/%D0%94%D0%BE%D0%BF%D0%BE%D0%BB%D0%BD%D0%B5%D0%BD%D0%B8%D1%8F.md">Дополнения</a></li>
</ol>

<h2 dir="auto"><a id="предисловие" class="anchor" aria-hidden="true" href="#предисловие"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Предисловие</h2>
<blockquote>
 <p dir="auto"><b>Техническая часть:</b></p>
</blockquote>

<ul>
<li>IDE: IntelliJ IDEA 2021.3.3</li>
<li>Версия JDK: 1.8.0_121</li>
</ul>

<blockquote>
 <p dir="auto"><b>Используемые технологии:</b></p>
</blockquote>

<ul>
<li>Java Swing</li>
<li>Java Core</li>
Это начальный вид экрана

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen8.jpg)

Логика данного проекта проработана таким обра
зом, что 

пк не делает ход рандомно, а просчитывает ходы, пытается не дать выйграть игроку и пытается выйграть сам.

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen4.jpg)
![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen3.jpg)

В данном случае победил человек

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen1.jpg)
![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen6.jpg)

По окончанию игры можно сыграть снова и снова!

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen5.jpg)

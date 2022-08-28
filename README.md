<h1 align="center">Tic-tac-toe Game - игра в крестики-нолики. <br> Реализованная при помощи Java Swing </h1>
<h2 dir="auto"><a id="user-content-оглавление" class="anchor" aria-hidden="true" href="#оглавление"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"></svg></a>Оглавление</h2>
<ol start="0" dir="auto">
<li><a href="#предисловие">Предисловие</a></li>
<li><a href="ход_компьютера">Ход компьютера</a></li>
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

<h2 dir="auto"><a id="предисловие" class="anchor" aria-hidden="true" href="#предисловие"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"></svg></a>
Предисловие</h2>
<p> Данный проект- это игра работающая в оконном режиме. <br> <b>Крестики-нолики</b> — логическая игра между двумя противниками на квадратном поле 3 на 3 клетки.
Один из игроков играет «крестиками», второй — «ноликами». В данном проекте "человек" играет "крестиками", а "компьютер" (искуственный интелект) - "ноликами". <br>

Игроки по очереди ставят на свободные клетки поля 3х3 знаки. Первый, выстроивший в ряд 3 своих фигур по вертикали, горизонтали или диагонали, выигрывает. 
Первый ход делает игрок, ставящий крестики.</p>
<blockquote>
 <p dir="auto"><b>Техническая часть:</b></p>
</blockquote>

<ul>
<li>IDE: IntelliJ IDEA 2022.1.2</li>
<li>Версия JDK: 17.0.2</li>
</ul>

<blockquote>
 <p dir="auto"><b>Используемые технологии:</b></p>
</blockquote>

<ul>
<li>Java Swing</li>
<li>Java Core</li>
</ul>

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/ai_won.gif)

<a href="#оглавление"><g-emoji class="g-emoji" alias="arrow_up" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2b06.png">⬆️</g-emoji>Оглавление</a>

<h2 dir="auto"><a id="ход_компьютера" class="anchor" aria-hidden="true" href="#предисловие"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"></svg></a>Ход компьтера</h2>

<p>Логика данного проекта проработана таким образом, что пк не делает ход рандомно, а просчитывает ходы, пытается не дать выйграть игроку и пытается выйграть сам.</p>

<a href="#оглавление"><g-emoji class="g-emoji" alias="arrow_up" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2b06.png">⬆️</g-emoji>Оглавление</a>

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen4.jpg)
![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen3.jpg)

В данном случае победил человек

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen1.jpg)
![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen6.jpg)

По окончанию игры можно сыграть снова и снова!

![Image for project](https://github.com/OlKomar35/tic-tac-toe_game/blob/master/image_for_project/screen5.jpg)

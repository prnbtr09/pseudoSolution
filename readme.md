Problem:

𝐔𝐬𝐢𝐧𝐠 𝐬𝐞𝐥𝐞𝐧𝐢𝐮𝐦 𝐚𝐮𝐭𝐨𝐦𝐚𝐭𝐢𝐨𝐧 - 𝐫𝐞𝐚𝐝 𝐭𝐡𝐞 * 𝐫𝐚𝐭𝐢𝐧𝐠 𝐨𝐟 𝐭𝐡𝐞 𝐛𝐨𝐨𝐤, 𝐞𝐧𝐭𝐞𝐫 𝐢𝐭 𝐢𝐧 𝐭𝐡𝐞 𝐭𝐞𝐱𝐭 𝐛𝐨𝐱 𝐚𝐧𝐝 𝐜𝐥𝐢𝐜𝐤 "𝐜𝐡𝐞𝐜𝐤 𝐫𝐚𝐭𝐢𝐧𝐠" 𝐛𝐮𝐭𝐭𝐨𝐧. 𝐲𝐨𝐮 𝐬𝐡𝐨𝐮𝐥𝐝 𝐬𝐞𝐞 "𝐰𝐞𝐥𝐥 𝐝𝐨𝐧𝐞!" 𝐦𝐞𝐬𝐬𝐚𝐠𝐞.

𝐋𝐢𝐧𝐤: https://lnkd.in/dr5adTZK
𝐇𝐢𝐧𝐭: Use CSS Pseudo-elements Concept

𝐅𝐨𝐫 𝐦𝐨𝐫𝐞 𝐈𝐧𝐟𝐨 𝐨𝐧 𝐂𝐒𝐒 𝐏𝐬𝐞𝐮𝐝𝐨-𝐞𝐥𝐞𝐦𝐞𝐧𝐭𝐬: https://lnkd.in/d9Uhd8QV

Your challenge is given above - just open the link & write down your automation script. You can code in any language you like - Java, Python,C# etc.

𝐒𝐡𝐚𝐫𝐞 𝐲𝐨𝐮𝐫 𝐜𝐨𝐝𝐞𝐬 𝐢𝐧 𝐚 𝐜𝐨𝐦𝐦𝐞𝐧𝐭! - 𝐋𝐞𝐭'𝐬 𝐋𝐞𝐚𝐫𝐧 & 𝐆𝐫𝐨𝐰 𝐓𝐨𝐠𝐞𝐭𝐡𝐞𝐫!😊

Let's jump in and make Day 3 a success!

Solution: Checkout the Master branch with Solution class.

Following is walkthrough to the code:
1. What is CSS: to add some style to some element



2. Pseudo Element: Now what if we want to apply some style let us color property to some portion of an element then comes Pseudo element.



3. How to add pseudo element style by simply adding double colon to the style (::)

then we can use Before, After, firstline, firstletter, marker etc to provide additional style to portion of above elements eg: to firstline, to firstletter etc.





Solution walkthrough:

Please take a look on above git repo



Now let us talk about original question how to get the text of rating which is using the concept of Pseudo element and has dom:

<label class="star-rating">

::after

</label>



1. click on after

2. In lower section styles will appear which will show additional information like as follows:

content: "***";

display: inline-block;

3. So now we need to get content and same is not possible through getText() because this is not directly available as part of element

4. We will have to use JavaScriptExecutor first thing to deal with these elements.

5. First of all need to find css which .className so it will be .star-rating in this case

6. Once we got the css, now we need to write following line:

js.executeScript("return window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')")

.toString();

7. document.QuerySelector will let us point to the element.

8. Once we get the element using css selector next step is to reach to pseudo element related content, so we will use getComputedStyle method.

9. this is how we will be able to find the


function palindromestring(str) {
    const len = str.length;
    for (let i = 0; i < len / 2; i++) 
    {
        if (string[i] !== string[len - 1 - i]) 
        {
            return 'the given string is not a palindrome';
        }
    }
    return 'the given string is palindrome';
}
    
    const string = prompt('Enter a string: ');
    const value = palindromestring(string);

window.onload = function(){
    document.getElementById('output').innerHTML = value;
};
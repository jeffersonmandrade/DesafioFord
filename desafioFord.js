const vinNumber="1HGCM82633A004352"

const criptoCesar = (vim) =>{
  const arrayVin = vim.split("")

  let newVin ='';

  arrayVin.forEach((e,i) =>   console.log(e.charAt(i))
  );
 return newVin
}

console.log(criptoCesar(vinNumber))
echo "\nGerando analisador com antlr par a pasta src/tradutorCsharp";
antlr4 -no-listener -visitor -package tradutorCsharp -o src/tradutorCsharp Csharp.g4;



echo "\nCompilando os codigos java para a pasta bin/";
javac -d bin/ src/conversores/*.java src/tradutorCsharp/*.java;



echo "\nExecutando a aplicacao com o input: input-csharp/User.cs "
cd bin/;
#java -verbose tradutorCsharp.ExecutaTradutor ../input-csharp/User.cs;
java tradutorCsharp.ExecutaTradutor "../../TrabalhoGB/input-csharp" "../../TrabalhoGB/output-typescript"

echo "\nExecutou!"

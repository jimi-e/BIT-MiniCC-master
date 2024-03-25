package bit.minisys.minicc.parser;

// Generated from mygrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mygrammarParser}.
 */
public interface mygrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(mygrammarParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(mygrammarParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#generic_selection}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_selection(mygrammarParser.Generic_selectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#generic_selection}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_selection(mygrammarParser.Generic_selectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#generic_assoc_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_assoc_list(mygrammarParser.Generic_assoc_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#generic_assoc_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_assoc_list(mygrammarParser.Generic_assoc_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#generic_association}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_association(mygrammarParser.Generic_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#generic_association}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_association(mygrammarParser.Generic_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(mygrammarParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(mygrammarParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(mygrammarParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(mygrammarParser.Argument_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(mygrammarParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(mygrammarParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(mygrammarParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(mygrammarParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(mygrammarParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(mygrammarParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(mygrammarParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(mygrammarParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(mygrammarParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(mygrammarParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(mygrammarParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(mygrammarParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(mygrammarParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(mygrammarParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(mygrammarParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(mygrammarParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(mygrammarParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(mygrammarParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#exclusive_OR_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_OR_expression(mygrammarParser.Exclusive_OR_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#exclusive_OR_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_OR_expression(mygrammarParser.Exclusive_OR_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#inclusive_OR_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_OR_expression(mygrammarParser.Inclusive_OR_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#inclusive_OR_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_OR_expression(mygrammarParser.Inclusive_OR_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#logical_AND_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_AND_expression(mygrammarParser.Logical_AND_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#logical_AND_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_AND_expression(mygrammarParser.Logical_AND_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#logical_OR_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_OR_expression(mygrammarParser.Logical_OR_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#logical_OR_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_OR_expression(mygrammarParser.Logical_OR_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(mygrammarParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(mygrammarParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(mygrammarParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(mygrammarParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(mygrammarParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(mygrammarParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mygrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mygrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(mygrammarParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(mygrammarParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(mygrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(mygrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(mygrammarParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(mygrammarParser.Declaration_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifier(mygrammarParser.Declaration_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#declaration_specifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifier(mygrammarParser.Declaration_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(mygrammarParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(mygrammarParser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(mygrammarParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(mygrammarParser.Init_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(mygrammarParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(mygrammarParser.Storage_class_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(mygrammarParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(mygrammarParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union_specifier(mygrammarParser.Struct_or_union_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union_specifier(mygrammarParser.Struct_or_union_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#struct_or_union}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union(mygrammarParser.Struct_or_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#struct_or_union}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union(mygrammarParser.Struct_or_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration_list(mygrammarParser.Struct_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#struct_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration_list(mygrammarParser.Struct_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(mygrammarParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(mygrammarParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecifier_qualifier_list(mygrammarParser.Specifier_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecifier_qualifier_list(mygrammarParser.Specifier_qualifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(mygrammarParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(mygrammarParser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(mygrammarParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(mygrammarParser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(mygrammarParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(mygrammarParser.Enum_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(mygrammarParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(mygrammarParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(mygrammarParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(mygrammarParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#enumerator_constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_constant(mygrammarParser.Enumerator_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#enumerator_constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_constant(mygrammarParser.Enumerator_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#atomic_type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_type_specifier(mygrammarParser.Atomic_type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#atomic_type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_type_specifier(mygrammarParser.Atomic_type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(mygrammarParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(mygrammarParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_specifier(mygrammarParser.Function_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#function_specifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_specifier(mygrammarParser.Function_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#alignment_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignment_specifier(mygrammarParser.Alignment_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#alignment_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignment_specifier(mygrammarParser.Alignment_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(mygrammarParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(mygrammarParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(mygrammarParser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(mygrammarParser.Direct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(mygrammarParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(mygrammarParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#type_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier_list(mygrammarParser.Type_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#type_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier_list(mygrammarParser.Type_qualifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type_list(mygrammarParser.Parameter_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#parameter_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type_list(mygrammarParser.Parameter_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(mygrammarParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(mygrammarParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(mygrammarParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(mygrammarParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(mygrammarParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(mygrammarParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(mygrammarParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(mygrammarParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(mygrammarParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(mygrammarParser.Abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_abstract_declarator(mygrammarParser.Direct_abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#direct_abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_abstract_declarator(mygrammarParser.Direct_abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void enterTypedef_name(mygrammarParser.Typedef_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#typedef_name}.
	 * @param ctx the parse tree
	 */
	void exitTypedef_name(mygrammarParser.Typedef_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(mygrammarParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(mygrammarParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list(mygrammarParser.Initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list(mygrammarParser.Initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(mygrammarParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(mygrammarParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#designator_list}.
	 * @param ctx the parse tree
	 */
	void enterDesignator_list(mygrammarParser.Designator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#designator_list}.
	 * @param ctx the parse tree
	 */
	void exitDesignator_list(mygrammarParser.Designator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(mygrammarParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(mygrammarParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#static_assert_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assert_declaration(mygrammarParser.Static_assert_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#static_assert_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assert_declaration(mygrammarParser.Static_assert_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mygrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mygrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(mygrammarParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(mygrammarParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(mygrammarParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(mygrammarParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#block_item_list}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item_list(mygrammarParser.Block_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#block_item_list}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item_list(mygrammarParser.Block_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(mygrammarParser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(mygrammarParser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(mygrammarParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(mygrammarParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(mygrammarParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(mygrammarParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(mygrammarParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(mygrammarParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(mygrammarParser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(mygrammarParser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaration(mygrammarParser.For_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaration(mygrammarParser.For_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#for_expression}.
	 * @param ctx the parse tree
	 */
	void enterFor_expression(mygrammarParser.For_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#for_expression}.
	 * @param ctx the parse tree
	 */
	void exitFor_expression(mygrammarParser.For_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(mygrammarParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(mygrammarParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(mygrammarParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(mygrammarParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(mygrammarParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(mygrammarParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(mygrammarParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(mygrammarParser.External_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(mygrammarParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(mygrammarParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mygrammarParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(mygrammarParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mygrammarParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(mygrammarParser.Declaration_listContext ctx);
}
package com.po.constraintprogrammingsolver.problems.jobshop.factories;

import com.po.constraintprogrammingsolver.problems.jobshop.factories.comparatorvariable.ComparatorVariableType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.indomain.IndomainType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.selectchoicepoint.SelectChoicePointComparatorVariableType;
import com.po.constraintprogrammingsolver.problems.jobshop.factories.selectchoicepoint.SelectChoicePointStoreType;

/**
 * Created by Aleksander on 2015-01-04.
 */
public class JacopProviders {
    private JacopProviders() {
    }

    public static JacopProvider simpleJacopProvider(IndomainType indomainType, SelectChoicePointStoreType selectChoicePointType) {
        return new SimpleJacopProvider(indomainType, selectChoicePointType);
    }

    public static JacopProvider comparatorVariableJacopProvider(IndomainType indomainType, ComparatorVariableType comparatorVariableType, SelectChoicePointComparatorVariableType selectChoicePointType) {
        return new ComparatorVariableJacopProvider(indomainType, comparatorVariableType, selectChoicePointType);
    }

}